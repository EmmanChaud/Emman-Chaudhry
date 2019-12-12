// A classical Singleton - notice that it is final.
package application;

import calculatorClasses.CalcModel;
import mainCode.BadTypeException;
import mainCode.EmptyStackException;

public final class Calculator extends CalcModel{
  private Calculator() {}
  private static Calculator instance = null;
  CalcModel c = new CalcModel();
  
  public static Calculator getInstance() {
    if (instance == null) {
      instance = new Calculator();
    }
    return instance;
  }

  public float evaluate(String text) throws BadTypeException, EmptyStackException {
      return c.evaluate(text, true); 
  }
}