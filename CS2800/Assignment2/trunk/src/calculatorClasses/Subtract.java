package calculatorClasses;

public class Subtract implements Expression {

	
	public Expression leftExpression; 
	public Expression rightExpression; 
	
	public Subtract(Expression leftExpression, Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public float evaluate() {
		return leftExpression.evaluate() - rightExpression.evaluate(); 
	}

}

