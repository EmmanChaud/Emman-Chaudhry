package testCodes;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mainCode.BadTypeException;
import mainCode.EmptyStackException;
import mainCodes.RevPolishCalc;

class TestRevPolishCalc {

	@Test
	void test() throws BadTypeException, EmptyStackException {
		RevPolishCalc tester = new RevPolishCalc();
		String a = "1f";
		tester.evaluate(a);
		assertEquals(1f, tester.getValue());
	}

}
