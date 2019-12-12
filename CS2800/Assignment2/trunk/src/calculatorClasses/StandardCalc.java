package calculatorClasses;

import java.util.ArrayList;
import java.util.List;
import mainCode.BadTypeException;
import mainCode.EmptyStackException;
import mainCode.Symbol;
import mainCodes.OpStack;

public class StandardCalc implements Calculator {

  @Override
  public float evaluate(String exp) throws BadTypeException, EmptyStackException {
    
    
    List<String> result = new ArrayList<String>();
    OpStack opStack = new OpStack();
    String[] stringArray = exp.split(" ");
    
    
    for (String s : stringArray) {
      
      
      if (!Operator.isOperator(s) && !Operator.isBracket(s)) {
        result.add(s);
      }
      
      
      else if (Operator.isOperator(s)) {
        while (!opStack.isEmpty() && getPriority(s) <= getPriority(opStack.peek().toString())) {
          result.add(opStack.pop().getSymbol());
        }
        opStack.push(Operator.getOpSymbol(s));
      }
      
      
      if (s.equals("(")) {
        opStack.push(Symbol.LEFT_BRACKET);
      }
      
      
      else if (s.equals(")")) {
        while (!opStack.isEmpty()) {
          if (opStack.peek() != Symbol.LEFT_BRACKET) {
            result.add(opStack.pop().getSymbol());
          } else {
            opStack.pop();
          }
        }
      }
      
    }    
    
    
    while (!opStack.isEmpty()){
      result.add(opStack.pop().getSymbol());
    }
    
    
    String finalResult = String.join(" ", result);
    RevPolishCalc converter = new RevPolishCalc();
    return converter.evaluate(finalResult);
  }
  
  static int getPriority(String s) {
    switch (s) {
      case "(":
        return 5;
      case "+":
      case "-":
        return 2;
      case "*":
      case "/":
        return 3;
    }
    return 0;
  }

}


