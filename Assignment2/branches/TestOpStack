package testCode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

import mainCode.BadTypeException;
import mainCode.EmptyStackException;
import mainCode.Symbol;
import mainCodes.OpStack;

public class TestOpStack {

	/**
	 * TEST1: testing to push a Symbol onto the Stack OpStack 
	 */
	@Test
	public void testPush() {
		OpStack tester = new OpStack();
		Symbol symbol = Symbol.PLUS;
		tester.push(symbol);
		assertFalse(tester.isEmpty());
	}
	
	/**
	 * TEST2: test to remove an element from the Stack opStack
	 * @throws EmptyStackException
	 * @throws BadTypeException
	 */
	@Test
	public void testPop() throws EmptyStackException, BadTypeException {
		OpStack tester = new OpStack();
		tester.push(Symbol.PLUS);
		tester.push(Symbol.TIMES);
		tester.push(Symbol.DIVIDE);
		tester.pop();
		assertEquals(Symbol.TIMES, tester.getSymbol());
		}

}
