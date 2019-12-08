package mainCodes;

public class Add implements Calculator{
	
	public Calculator leftExpression; 
	public Calculator rightExpression; 
	
	public Add(Calculator leftExpression, Calculator rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public float evaluate() {
		return leftExpression.evaluate() + rightExpression.evaluate(); 
	}

}
