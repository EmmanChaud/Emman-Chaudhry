package calculatorClasses;

public class Divide implements Calculator {

	
	public Calculator leftExpression; 
	public Calculator rightExpression; 
	
	public Divide(Calculator leftExpression, Calculator rightExpression) {
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
