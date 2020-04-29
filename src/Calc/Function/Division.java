package Calc.Function;

public class Division extends BinaryOperation {
	
	public Division(Function left, Function right) {
		super(left, right);
	}

	public double evaluate() {
		if (right.evaluate() != 0){
			return (left.evaluate() / right.evaluate());} else
			throw new ArithmeticException("Division by zero!");
	}
	
	@Override
	public String toString() {
		return "(" + left.toString() + " / " + right.toString() + ")";
	}
}
