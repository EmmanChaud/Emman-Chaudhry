package calculatorClasses;

public class Divide implements Expression {

	
	public Expression leftExpression; 
	public Expression rightExpression; 
	
	public Divide(Expression leftExpression, Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public float evaluate() {
		final float numerator = this.leftExpression.evaluate();
		final float denominator = this.rightExpression.evaluate();
		if(denominator == 0) {
			throw new ArithmeticException("Can't divide by zero");
		}
		return numerator / denominator;
	}

}
