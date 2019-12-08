package testCodes;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mainCodes.Add;
import mainCodes.Calculator;
import mainCodes.Divide;
import mainCodes.NumberExp;
import mainCodes.Operator;
import mainCodes.Subtract;
import mainCodes.Times;

class TestOperator {

	@Test
	void test() {
		Operator tester = new Operator();
		String operand = "+";
		assertTrue("+", tester.isOperator(operand));
	}
	
	@Test
	void test2() {
		Operator tester = new Operator();
		String operand = "+";
		Calculator left = null;
		Calculator right = null;
		Add add = new Add(left,right);
		Subtract subtract = new Subtract(left,right);
		Times times = new Times(left, right);
		Divide divide = new Divide(left,right);
		NumberExp number = new NumberExp(1f);
		assertNotNull(tester.getOperator(operand, left, right));
	}

}
