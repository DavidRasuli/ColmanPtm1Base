package test;

public class Div extends BinaryExpression {

	public Div(Expression left, Expression right) {
		super(left, right);
	}

	public Div(double left, double right){
		super(left,right);
	}
	
	@Override
	public double calculate() {
		return left.calculate()/right.calculate();
	}

}
