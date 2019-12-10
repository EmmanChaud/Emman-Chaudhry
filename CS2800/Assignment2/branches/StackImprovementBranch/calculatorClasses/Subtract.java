package calculatorClasses;

public class Subtract implements Calculator {

	
	public Calculator leftExpression; 
	public Calculator rightExpression; 
	
	public Subtract(Calculator leftExpression, Calculator rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public float evaluate() {
		return leftExpression.evaluate() - rightExpression.evaluate(); 
	}

}

