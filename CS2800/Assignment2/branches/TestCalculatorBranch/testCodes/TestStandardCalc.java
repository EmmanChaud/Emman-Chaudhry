package testCodes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import calculatorClasses.StandardCalc;
import mainCode.BadTypeException;
import mainCode.EmptyStackException;

class TestStandardCalc {

	@Test
	void test2() throws BadTypeException, EmptyStackException {
	  StandardCalc tester = new StandardCalc();
	  String a = "( 5 * ( 6 + 7 ) ) - 2";
	  assertEquals(63.0, tester.evaluate(a));
	}
	  
	  @Test
	  void testSpacesBetweenCharacters() throws BadTypeException, EmptyStackException {
	    StandardCalc tester = new StandardCalc(); 
	    String a = "( 10 + 2 )";
	    assertEquals(12.0,tester.evaluate(a));
	    
	  }
	  
	

}
