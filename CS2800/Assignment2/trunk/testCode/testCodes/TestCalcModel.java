package testCodes;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import calculatorClasses.CalcModel;
import mainCode.BadTypeException;
import mainCode.EmptyStackException;

class TestCalcModel {

  @Test
  void testEvaluate() throws BadTypeException, EmptyStackException {
    CalcModel tester = new CalcModel();
    String a = "( 10 + 2 )";
    boolean infix = "infix" != null; 
    assertEquals(12.0, tester.evaluate(a, infix) );
  }

}
