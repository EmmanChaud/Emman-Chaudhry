package testCodes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mainCodes.Operator;

class TestOperator {

	@Test
	void test() {
		Operator tester = new Operator();
		String operand = "+";
		assertTrue("+", tester.isOperator(operand));
	}

}
