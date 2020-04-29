package Calc.Function;

public class Exponentiation extends BinaryOperation {

	public Exponentiation(Function left, Function right) {
		super(left, right);
	}

	public double evaluate() {
		return Math.pow(left.evaluate(), right.evaluate());
	}

	@Override
	public String toString() {
		return "(" + left.toString() + ")^(" + right.toString() + ")";
	}

}
