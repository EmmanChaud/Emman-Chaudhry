package calculatorClasses;


public class Operator {

  public static boolean isOperator(String operator) {
    if (operator.equals("+") || operator.equals("-") || operator.equals("*")
        || operator.equals("/")) {
      return true;
    }
    return false;
  }

  public static Calculator getOperator(String operator, Calculator leftExpression,
      Calculator rightExpression) {
    switch (operator) {
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

