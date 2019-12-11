package calculatorClasses;

import mainCode.BadTypeException;
import mainCode.EmptyStackException;
import mainCode.Symbol;
import mainCodes.OpStack;

public class StandardCalc {

  static int getPriority(String s) {
    switch (s) {
      case "(":
        return 1;
      case "+":
      case "-":
        return 2;
      case "*":
      case "/":
        return 3;
    }
    return 0;
  }

  public static String infixToPostfix(String exp) throws EmptyStackException, BadTypeException {

    String result = new String("");
    OpStack opStack = new OpStack();
    String[] stringArray = exp.split("");

    for (String s : stringArray) {

      if (!Operator.isOperator(s)) {
        result += s;
      }

      else if (Operator.isOperator(s)) {
        while(!opStack.isEmpty() && getPriority(s) <= getPriority(opStack.peek())) {
           result += opStack.pop().getSymbol();
        }
        opStack.push(Operator.getOpSymbol(s));
      }

      if (s == "(") {
        opStack.push(Symbol.LEFT_BRACKET);
      }

      if (s == ")") {
        while (!opStack.isEmpty() && opStack.peek() != Symbol.LEFT_BRACKET.getSymbol()) {
          result += opStack.pop().getSymbol();
        }
        opStack.pop();
      }
    }

    while (!opStack.isEmpty()) {
      result += opStack.pop().getSymbol();
    }

    return result;
  }


  // public float evalExpression(String a) throws BadTypeException, EmptyStackException {
  // String expression = infixToPostfix(a);
  // RevPolishCalc result = new RevPolishCalc();
  // return result.evalExpression(expression);
  // }


}


