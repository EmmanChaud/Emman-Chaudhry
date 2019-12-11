package testCodes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import calculatorClasses.RevPolishCalc;
import mainCode.BadTypeException;
import mainCode.EmptyStackException;

class TestRevPolishCalc {

	
	@Test
	void test2() throws BadTypeException, EmptyStackException {
		RevPolishCalc tester = new RevPolishCalc();
		String string = "567+*2-";
		assertEquals(63, tester.evaluate(string));
		System.out.println(tester.evaluate(string)); 
	}

}
