package calculatorClasses;

import mainCode.BadTypeException;
import mainCode.EmptyStackException;
import mainCodes.OpStack;

public class StandardCalc {


  static int getPriority(String ch) 
  { 
      switch (ch) 
      { 
      case "+": 
      case "-": 
          return 1; 
     
      case "*": 
      case "/": 
          return 2; 
      } 
      return -1; 
  } 
  
  public static String infixToPostfix(String exp) throws EmptyStackException, BadTypeException 
  { 


      String result = new String(""); 
      OpStack opStack = new OpStack();
      String[] stringArray = exp.split("");
        
      for(String s: stringArray) {
        
        if(!Operator.isOperator(s)) {
          result += s;
        }
        
        else if(Operator.isOperator(s)) {
          while(!opStack.isEmpty() && getPriority(s) <= getPriority(opStack.peek())) {
            result += opStack.pop().getSymbol();
          }
          opStack.push(Operator.getOpSymbol(s));
        }
        
        if(s == "(") {
          opStack.push(Operator.getOpSymbol(s));
        }
        
        if(s == ")") {
          while(!opStack.isEmpty() && opStack.peek() != "(") {
            result += opStack.pop().getSymbol();
          }
          opStack.pop();
        }
      }
      
      while(!opStack.isEmpty()) {
        result += opStack.pop();
      }
      
      return result; 
  }
       
}


