package testCodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mainCode.BadTypeException;
import mainCode.EmptyStackException;
import mainCode.Symbol;
import mainCodes.StrStack;

class TestStrStack {


	/**
	 * TEST1: testing to push a String onto the Stack strStack 
	 * @throws BadTypeException 
	 */
	@Test
	public void testPush() throws BadTypeException {
		StrStack tester = new StrStack();
		tester.push("a");
		assertFalse(tester.isEmpty());
	}
	
	/**
	 * TEST2: test to remove an String from the Stack strStack
	 * @throws EmptyStackException
	 * @throws BadTypeException
	 */
	@Test
	public void testPop() throws EmptyStackException, BadTypeException {
		StrStack tester = new StrStack();
		tester.push("a");
		tester.push("b");
		tester.push("c");
		tester.pop();
		assertEquals("b", tester.getString().toString());
		}

}
