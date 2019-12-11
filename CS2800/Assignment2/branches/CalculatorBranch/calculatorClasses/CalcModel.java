package calculatorClasses;

import mainCode.BadTypeException;
import mainCode.EmptyStackException;

public class CalcModel {
  
  StandardCalc standardCalc = new StandardCalc();
  RevPolishCalc revPolishCalc = new RevPolishCalc(); 
  Calculator calc;

  public float evaluate(String a, boolean infix) throws BadTypeException, EmptyStackException {
    if(infix) {
      calc = standardCalc;
    } else {
      calc = revPolishCalc;
    }
    return calc.evaluate(a);
  }

}
