package Calc.Function;

public class Subtraction extends BinaryOperation {
	
	public Subtraction(Function left, Function right) {
		super(left, right);
	}

	@Override
	public double evaluate() {
		return (left.evaluate() - right.evaluate());
	}
	
	@Override
	public String toString() {
		return "(" + left.toString() + " - " + right.toString() + ")";
	}
}
