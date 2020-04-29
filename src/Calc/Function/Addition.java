package Calc.Function;

public class Addition extends BinaryOperation {
	
	public Addition(Function left, Function right) {
		super(left, right);
	}

	public double evaluate() {
		return (left.evaluate() + right.evaluate());
	}
	
	@Override
	public String toString() {
		return "(" + left.toString() + " + " + right.toString() + ")";
	}
	
}
