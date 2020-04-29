package Calc.Function;

public class Negation extends UnaryOperation {
	
	public Negation(Function operator) {
		super(operator);
	}

	@Override
	public double evaluate() {
		return operator.evaluate();
	}
	@Override
	public String toString() {
		return "( -1 * " + operator.toString()+ ")";
	}
}
