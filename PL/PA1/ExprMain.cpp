#include <iostream>
#include <map>
#include <stack>
#include <string>

#include "antlr4-cpp/ExprBaseListener.h"
#include "antlr4-cpp/ExprLexer.h"
#include "antlr4-cpp/ExprParser.h"

using namespace std;
using namespace antlr4;
using namespace antlr4::tree;


class EvalListener : public ExprBaseListener {

	map<string, string> vars;

	stack<double> numStack;
	stack<char> opStack;

	
	string exp;
	string id;
	bool assnFlag = false;

	int getPR(char op) { // 연산자 우선순위 반환
		if (op == '*' || op == '/')
			return 2;
		else if (op == '+' || op == '-')
			return 1;
		else
			return 0;
	}
	bool comPR(char op1, char op2) // 연산자 우선순위 비교
	{
		int op1_pr = getPR(op1);
		int op2_pr = getPR(op2);

		return (op1_pr >= op2_pr);
	}
	int isOP(char op) { // 연산자 판별
		if (op == '+' || op == '-' || op == '*' || op == '/')
			return 1;
		else
			return 0;
	}
	void convPostfix(char op) { // 전위연산으로 변환
		char temp_op[2];
		temp_op[0] = op;
		temp_op[1] = '\0';
		string temp_str(temp_op);
		exp = exp + " " + temp_str;
	}

public:
	virtual void enterProg(ExprParser::ProgContext *ctx) {
		// cout << "enterProg: \n";
	}
	virtual void exitProg(ExprParser::ProgContext *ctx) {
		// cout << "exitProg: \n";
	}
	virtual void enterExpr(ExprParser::ExprContext *ctx) {
		// cout << "\tenterExpr: \n";
	}
	virtual void exitExpr(ExprParser::ExprContext *ctx) {
		// cout << "\texitExpr: \n";
	}
	virtual void visitTerminal(tree::TerminalNode *node) {
		// cout << "\t\tTerminal: " << node->getText() << "\n";


		// getSymbol(), getType(), getText() 이런게 다 g4 파일 바탕으로 자른거에서 해당 값들 가져올 수 있게 하는 함수였던듯
		if (node->getSymbol()->getType() == ExprLexer::INT || node->getSymbol()->getType() == ExprLexer::REAL) {
			if (assnFlag) {
				vars.insert(make_pair(id, node->getText())); // 이게 아마 id랑 값이랑 mapping 해주는 거일텐데 정확히 기억은 안남
			}
			else { // 2+2 를 2 + 2 이렇게 만들어주는 걸로 기억 나중에 " " 이걸 바탕으로 자름
				exp = exp + " " + node->getText();
			}
		}
		else if (node->getSymbol()->getType() == ExprLexer::ID) { // 변수명
			id = node->getText();
			if (vars.count(id)) {
				exp = exp + " " + vars[id]; // 이것도 자를 때 구분자 넣어준거
			}
		}
		else if (node->getText() == "=") { // assignment 판별
			assnFlag = true;
		}
		else if (node->getSymbol()->getText() == "(") {
			opStack.push('(');
		}
		else if (node->getSymbol()->getText() == ")") { // 이 밑으로는 괄호를 포함하는 연산하는 거일텐데 자료구조에서 배웠을거임 그거 참고해서 ㄱㄱ
			while (opStack.top() != '(') {
				convPostfix(opStack.top());
				opStack.pop();
			}
			opStack.pop();
		}
		else if (node->getSymbol()->getText() == "+") {
			if (opStack.empty()) {
				opStack.push('+');
			}
			else {
				while (comPR(opStack.top(), '+')) {
					convPostfix(opStack.top());
					opStack.pop();
				}
				opStack.push('+');
			}
		}
		else if (node->getSymbol()->getText() == "-") {
			if (opStack.empty()) {
				opStack.push('-');
			}
			else {
				while (comPR(opStack.top(), '-')) {
					convPostfix(opStack.top());
					opStack.pop();
				}
				opStack.push('-');
			}
		}
		else if (node->getSymbol()->getText() == "*") {
			if (opStack.empty()) {
				opStack.push('*');
			}
			else {
				while (comPR(opStack.top(), '*')) {
					convPostfix(opStack.top());
					opStack.pop();
				}
				opStack.push('*');
			}
		}
		else if (node->getSymbol()->getText() == "/") {
			if (opStack.empty()) {
				opStack.push('/');
			}
			else {
				while (comPR(opStack.top(), '/')) {
					convPostfix(opStack.top());
					opStack.pop();
				}
				opStack.push('/');
			}
		}
		else if (node->getSymbol()->getText() == ";") {
			if (assnFlag) {
				assnFlag = false;
				return;
			}
			while (!opStack.empty()) {
				convPostfix(opStack.top());
				opStack.pop();
			}

			char temp_exp[100];
			strcpy(temp_exp, exp.c_str());
			char* postfixEval = strtok(temp_exp, " "); // 이게 아까 말한 " "를 구분자로 두고 자르는거
			while (postfixEval != NULL) {
				if (!strcmp(postfixEval, "0") || atof(postfixEval) != 0) {
					numStack.push(atof(postfixEval));
				}
				else {
					double num1 = numStack.top(); // 피연산자 1
					numStack.pop();
					double num2 = numStack.top(); // 피연산자 2
					numStack.pop();
					if (postfixEval[0] == '+') {
						numStack.push(num2 + num1);
					}
					else if (postfixEval[0] == '-') {
						numStack.push(num2 - num1);
					}
					else if (postfixEval[0] == '*') {
						numStack.push(num2 * num1);
					}
					else if (postfixEval[0] == '/') {
						numStack.push(num2 / num1);
					}
					else {
						break;
					}
				}
				postfixEval = strtok(NULL, " ");
			}
			double res = numStack.top();
			numStack.pop();
			assnFlag = false;
			id = "";
			exp = "";
			cout << res << endl;
		}
	}
};

int main(int argc, const char* argv[]) {
	if (argc < 2) {
		cerr << "[Usage] " << argv[0] << "  <input-file>\n";
		exit(0);
	}
	std::ifstream stream;
	stream.open(argv[1]);
	if (stream.fail()) {
		cerr << argv[1] << " : file open fail\n";
		exit(0);
	}

	// cout << "---Expression Evaluation with ANTLR listener---\n";
	ANTLRInputStream input(stream);
	ExprLexer lexer(&input);
	CommonTokenStream tokens(&lexer);
	ExprParser parser(&tokens);	
	ParseTree *tree = parser.prog();

	// cout << tree->toStringTree(&parser) << endl;

	ParseTreeWalker walker;
	EvalListener listener;	

	walker.walk(&listener, tree);
}
