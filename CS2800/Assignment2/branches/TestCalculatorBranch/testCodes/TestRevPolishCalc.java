package testCodes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mainCode.BadTypeException;
import mainCode.EmptyStackException;
import mainCodes.RevPolishCalc;

class TestRevPolishCalc {

	
	@Test
	void test2() throws BadTypeException, EmptyStackException {
		RevPolishCalc tester = new RevPolishCalc();
		String string = "5 6 7 + * 2 -";
		assertEquals(63, tester.evalExpression(string));
		System.out.println(tester.evalExpression(string)); 
	}

}
