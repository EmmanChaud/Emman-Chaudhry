package mainCodes;


public class Operator {

	public static boolean isOperator(String operand) {
		if(operand.equals("+")|| operand.equals("-")|| operand.equals("*")|| operand.equals("/")) {
			return true;
		}
		return false;
	}

	public static Calculator getOperator(String operand, Calculator leftExpression, Calculator rightExpression) {
		switch(operand) {
		case "+":
			return new Add(leftExpression, rightExpression);
		case "-":
			return new Subtract(leftExpression, rightExpression);
		case "*":
			return new Times(leftExpression, rightExpression);
		case "/":
			return new Divide(leftExpression, rightExpression);
		}
		return null; 
	}

}
