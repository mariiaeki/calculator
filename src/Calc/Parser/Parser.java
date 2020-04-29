package Calc.Parser;

import Calc.Function.Addition;
import Calc.Function.Division;
import Calc.Function.Exponentiation;
import Calc.Function.Function;
import Calc.Function.Multiplication;
import Calc.Function.Negation;
import Calc.Function.Number;
import Calc.Function.Subtraction;
import Calc.Parser.Scanner.Scanner;
import Calc.Parser.Scanner.Token;
import Calc.Parser.Scanner.TokenType;

public class Parser {
	
	public static Function parse(String input) {
		Scanner scanner = new Scanner(input);
		
		return parseAdditiveExpression(scanner);
	}
	
	private static Function parseAdditiveExpression(Scanner scanner) {
		Function left = parseMultiplicativeExpression(scanner);
		Token token = scanner.nextToken();
		while (true) {
			switch (token.getType()) {
			case PLUS_OP:
				left = new Addition(left, parseMultiplicativeExpression(scanner));
				token = scanner.nextToken();
				break;
			case MINUS_OP:
				left = new Subtraction(left, parseMultiplicativeExpression(scanner));
				token = scanner.nextToken();
				break;
			default:
				scanner.pushBack(token);
				return left;
			}
		}
	}
	
	private static Function parseMultiplicativeExpression(Scanner scanner) {
		Function left = parseExponentiationExpression(scanner);
		Token token = scanner.nextToken();
		while (true) {
			switch (token.getType()) {
				case MULT_OP:
					left = new Multiplication(left, parseExponentiationExpression(scanner));
					token = scanner.nextToken();
					break;
				case DIV_OP:
					left = new Division(left, parseExponentiationExpression(scanner));
					token = scanner.nextToken();
					break;
				default:
					scanner.pushBack(token);
					return left;
			}
		}
	}
	
	private static Function parseExponentiationExpression(Scanner scanner) {
		Function left = parseElementaryExpression(scanner);
		Token token = scanner.nextToken();
		if (token.getType() == TokenType.EXP_OP) {
			left = new Exponentiation(left, parseExponentiationExpression(scanner));
		} else {
			scanner.pushBack(token);
		}
		return left;
	}
	
	private static Function parseElementaryExpression(Scanner scanner) {
		Token token = scanner.nextToken();
		switch (token.getType()) {
		case NUMBER:
			return new Number(Double.parseDouble(token.getContent()));

		case MINUS_OP:
			return new Negation(parseElementaryExpression(scanner));
		case LEFT_PAR:
			Function result = parseAdditiveExpression(scanner);
			if (scanner.nextToken().getType() != TokenType.RIGHT_PAR) {
				throw new UnsupportedOperationException();
			}
			return result;
			case PI:
				return new Number(Math.PI);
			case E:
				return new Number(Math.E);

		default:
			throw new UnsupportedOperationException();
		}
	}
	
}
