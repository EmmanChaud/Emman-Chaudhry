package testCodes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mainCode.BadTypeException;
import mainCode.EmptyStackException;
import mainCodes.RevPolishCalc;
import mainCodes.StandardCalc;

class TestStandardCalc {

	@Test
	void test() throws BadTypeException, EmptyStackException {
		StandardCalc tester = new StandardCalc();
		String a = "1f";
		tester.evaluate(a);
		assertEquals(1f, tester.getValue());
	}

}
