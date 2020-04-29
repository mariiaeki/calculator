package Calc.Function;

public abstract class UnaryOperation extends Function {
	
	protected Function operator;
	
	public UnaryOperation(Function operator) {
		this.operator = operator;
		throw new UnsupportedOperationException();
	}
	
}
