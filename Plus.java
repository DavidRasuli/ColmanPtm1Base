package test;

public class Plus extends BinaryExpression {

	public Plus(Expression left, Expression right) {
		super(left, right);
	}

	public Plus(double left, double right){
		super(left,right);
	}
	
	@Override
	public double calculate() {
		return left.calculate()+right.calculate();
	}

}
