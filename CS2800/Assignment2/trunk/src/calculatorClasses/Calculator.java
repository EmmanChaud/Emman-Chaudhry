package calculatorClasses;

import mainCode.BadTypeException;
import mainCode.EmptyStackException;

public interface Calculator {
  
  public float evaluate(String what) throws BadTypeException, EmptyStackException;

}
