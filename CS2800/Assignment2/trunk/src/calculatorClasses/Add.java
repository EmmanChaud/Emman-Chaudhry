package calculatorClasses;

public class Add implements Expression{
	
	public Expression leftExpression; 
	public Expression rightExpression; 
	
	public Add(Expression leftExpression, Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public float evaluate() {
		return leftExpression.evaluate() + rightExpression.evaluate(); 
	}

}
