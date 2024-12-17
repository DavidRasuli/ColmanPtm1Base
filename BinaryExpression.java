package test;

public abstract class BinaryExpression implements Expression {

	protected Expression left,right;
	public BinaryExpression(Expression left,Expression right) {
		this.left=left;
		this.right=right;
	}

	public BinaryExpression(double left, double right) {
		this(new Number(left), new Number(right));
	}

}
