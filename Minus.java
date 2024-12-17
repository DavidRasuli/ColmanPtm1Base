package test;

public class Minus extends BinaryExpression {

	public Minus(Expression left, Expression right) {
		super(left, right);
	}

	public Minus(double left, double right){
		super(left,right);
	}

	@Override
	public double calculate() {
		return left.calculate()-right.calculate();
	}

}
