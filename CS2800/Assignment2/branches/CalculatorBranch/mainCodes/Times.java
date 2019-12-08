package mainCodes;

public class Times implements Calculator {

	
	public Calculator leftExpression; 
	public Calculator rightExpression; 
	
	public Times(Calculator leftExpression, Calculator rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public float evaluate() {
		return leftExpression.evaluate() * rightExpression.evaluate(); 
	}

}

