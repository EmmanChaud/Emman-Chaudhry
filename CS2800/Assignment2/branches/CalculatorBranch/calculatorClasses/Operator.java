package calculatorClasses;

import mainCode.Symbol;

public class Operator {

	public static boolean isOperator(String operand) {
		if(operand.equals("+")|| operand.equals("-")|| operand.equals("*")|| operand.equals("/")|| operand.equals("(")|| operand.equals(")")) {
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
	
	public static Symbol getOpSymbol(String s) {
	  switch(s) {
	       case "+":
	            return Symbol.PLUS;
	        case "-":
	            return Symbol.MINUS;
	        case "*":
	          Symbol times = Symbol.TIMES;
	            return Symbol.TIMES;
	        case "/":
	            return Symbol.DIVIDE;
	        case "(":
	          Symbol leftBracket = Symbol.LEFT_BRACKET;
              return leftBracket;
	        case ")":
              return Symbol.RIGHT_BRACKET;
	        }
	        return null; 
	  }
	
	}

