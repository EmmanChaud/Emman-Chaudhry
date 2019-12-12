package calculatorClasses;

import mainCode.Symbol;

public class Operator {

  public static Expression getOperator(String operand, Expression leftExpression,
      Expression rightExpression) {
    switch (operand) {
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
  
  public static boolean isOperator(String operand) {
    if (operand.equals("+") || operand.equals("-") || operand.equals("*") || operand.equals("/")) {
      return true;
    } else if(operand.equals("(") || operand.equals(")")) {
      return false;
    }
    return false;
  }
  
  public static boolean isBracket(String operand) {
    if(operand.equals("(") || operand.equals(")")) {
      return true;
    }
    return false;
  }
  

  public static Symbol getOpSymbol(String s) {
    switch (s) {
      case "+":
        return Symbol.PLUS;
      case "-":
        return Symbol.MINUS;
      case "*":
        return Symbol.TIMES;
      case "/":
        return Symbol.DIVIDE;
    }
    return Symbol.INVALID;
  }

}

