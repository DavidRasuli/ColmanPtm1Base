package test;

public class Mul extends BinaryExpression {

	public Mul(Expression left, Expression right) {
		super(left, right);
	}

	public Mul(double left, double right){
		super(left,right);
	}
	
	@Override
	public double calculate() {
		return left.calculate()*right.calculate();
	}

}
