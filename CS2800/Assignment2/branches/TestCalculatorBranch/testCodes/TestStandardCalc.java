package testCodes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import calculatorClasses.StandardCalc;
import mainCode.BadTypeException;
import mainCode.EmptyStackException;

class TestStandardCalc {

	@Test
	void test() throws BadTypeException, EmptyStackException {
		StandardCalc tester = new StandardCalc();
		String a = "(5*(6+7))-2";
		tester.infixToPostfix(a);
		assertEquals("567+*2-", tester.infixToPostfix(a));
	}
	
//	@Test
//	void test2() throws BadTypeException, EmptyStackException {
//	  StandardCalc tester = new StandardCalc();
//	  String a = "(5*(6+7))-2";
//	  assertEquals(63.0, tester.evalExpression(a));
//	  
//	}

}
