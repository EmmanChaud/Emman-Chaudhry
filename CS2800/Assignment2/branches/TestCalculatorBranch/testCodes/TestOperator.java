package testCodes;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import calculatorClasses.Add;
import calculatorClasses.Calculator;
import calculatorClasses.Divide;
import calculatorClasses.NumberExp;
import calculatorClasses.Operator;
import calculatorClasses.Subtract;
import calculatorClasses.Times;

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
