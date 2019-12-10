package calculatorClasses;

import mainCode.BadTypeException;
import mainCode.EmptyStackException;
import stackClasses.NumStack;

public class RevPolishCalc {

  NumStack values = new NumStack();

  public float evalExpression(String expression) throws BadTypeException, EmptyStackException {
    String[] expressionArray = expression.split(" ");
    for (String s : expressionArray) {
      if (Operator.isOperator(s)) {
        Calculator rightExpression = new NumberExp(values.pop());
        Calculator leftExpression = new NumberExp(values.pop());
        Calculator operator = Operator.getOperator(s, leftExpression, rightExpression);
        float result = operator.evaluate();
        values.push(result);
      } else {
        Calculator i = new NumberExp(Float.parseFloat(s));
        values.push(i.evaluate());
      }
    } 
    return values.pop();
  }
}
