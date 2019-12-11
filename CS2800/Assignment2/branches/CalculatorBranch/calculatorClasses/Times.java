package calculatorClasses;

public class Times implements Expression {

	
	public Expression leftExpression; 
	public Expression rightExpression; 
	
	public Times(Expression leftExpression, Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public float evaluate() {
		return leftExpression.evaluate() * rightExpression.evaluate(); 
	}

}

