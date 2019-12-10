package testCodes;

import static org.junit.Assert.*;

import org.junit.Test;

import mainCode.BadTypeException;
import mainCode.EmptyStackException;
import mainCode.Symbol;
import mainCodes.OpStack;

public class TestOpStack {

	/**
	 * TEST1: testing to push a Symbol onto the Stack opStack 
	 */
	@Test
	public void testPush() {
		OpStack tester = new OpStack();
		tester.push(Symbol.PLUS);
		assertFalse(tester.isEmpty());
	}
	
	/**
	 * TEST2: test to remove an Symbol from the Stack opStack
	 * @throws EmptyStackException
	 * @throws BadTypeException
	 */
	@Test
	public void testPop() throws EmptyStackException, BadTypeException {
		OpStack tester = new OpStack();
		tester.push(Symbol.DIVIDE);
		tester.push(Symbol.LEFT_BRACKET);
		tester.push(Symbol.PLUS);
		tester.pop();
		assertEquals(Symbol.LEFT_BRACKET, tester.getSymbol());
		}
	
	@Test
	public void testPushThenPeak() throws EmptyStackException, BadTypeException {
	  OpStack tester = new OpStack();
	  tester.push(Symbol.DIVIDE);
	  float size = tester.size();
	  assertEquals(tester.peek(), "/");
	  
	}
}
