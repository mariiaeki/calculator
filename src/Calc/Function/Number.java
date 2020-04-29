package Calc.Function;

public class Number extends Function {
	
	private double value;
	
	public Number(double value) {
		this.value = value;
	}

	@Override
	public double evaluate() {
		return value;
	}
	
	@Override
	public String toString() {
		return Double.toString(value);
	}
}
