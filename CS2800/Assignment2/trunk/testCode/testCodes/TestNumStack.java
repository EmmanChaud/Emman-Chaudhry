package testCodes;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import mainCode.BadTypeException;
import mainCode.EmptyStackException;
import mainCodes.NumStack;

public class TestNumStack {

	/**
	 * TEST1: testing to push a float onto the Stack numStack 
	 */
	@Test
	public void testPush() {
		NumStack tester = new NumStack();
		tester.push(1f);
		assertFalse(tester.isEmpty());
	}
	
	/**
	 * TEST2: test to remove an element from the Stack numStack
	 * @throws EmptyStackException
	 * @throws BadTypeException
	 */
	@Test
	public void testPop() throws EmptyStackException, BadTypeException {
		NumStack tester = new NumStack();
		tester.push(1f);
		tester.push(2f);
		tester.push(3f);
		tester.pop();
		assertEquals(2f, tester.size(), 0);
		}
	
}
