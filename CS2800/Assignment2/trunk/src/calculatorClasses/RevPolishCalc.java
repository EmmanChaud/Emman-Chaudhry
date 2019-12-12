package calculatorClasses;

import mainCode.BadTypeException;
import mainCode.EmptyStackException;
import mainCodes.NumStack;

public class RevPolishCalc implements Calculator{


  @Override  
  public float evaluate(String expression) throws BadTypeException, EmptyStackException {
    NumStack values = new NumStack();
    String[] expressionArray = expression.split(" ");
    for (String s : expressionArray) {
      if (Operator.isOperator(s)) {
        Expression rightExpression = new NumberExp(values.pop());
        Expression leftExpression = new NumberExp(values.pop());
        Expression operator = Operator.getOperator(s, leftExpression, rightExpression);
        float result = operator.evaluate();
        values.push(result);
      } else {
        Expression i = new NumberExp(Float.parseFloat(s));
        values.push(i.evaluate());
      }
    } 
    return values.pop();
  }


  }
  
