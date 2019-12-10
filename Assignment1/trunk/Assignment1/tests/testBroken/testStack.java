package testBroken;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import mainCode.BadTypeException;
import mainCode.EmptyStackException;
import mainCode.Entry;
import mainCode.Stack;

class testStack {

	/**
	 * TEST1: Tests an empty stack
	 * 
	 * @return True, when the stack is empty i.e size == 0
	 */
	@Test
	public void testEmpty() {
		Stack tester = new Stack();
		assertTrue(tester.isEmpty());

	}

	/**
	 * TEST2: Test to push an element onto a stack
	 * 
	 * @return false, indicating that the stack is not empty
	 */
	@Test
	public void testPush() {
		Stack tested = new Stack();
		tested.push(new Entry(1));
		assertFalse(tested.isEmpty());
	}

	/**
	 * TEST3: Test to return top element of the stack
	 * @throws EmptyStackException
	 */
	@Test
	public void testTop() throws EmptyStackException {
		Stack topStack = new Stack();
		topStack.push(new Entry(1));
		topStack.top();
		assertEquals(1, topStack.size());
	}

	/**
	 * TEST4: Loop which adds a new Entry every time
	 * 
	 * @param i Specifies the stack count
	 * @return False, indicating that the stack is not empty
	 */
	@Test
	public void testPushLoop() {
		Stack pushStack = new Stack();
		for (float i = 0f; i < 5f; i++) {
			pushStack.push(new Entry(i));
			System.out.println(pushStack.size());
			assertFalse(pushStack.isEmpty());
		}

	}

	/**
	 * TEST5: Test to pop elements out of a stack
	 * @throws EmptyStackException 
	 * 
	 * @throws EmptyStackException, when size is < 0
	 */
	@Test
	public void testPop() throws EmptyStackException {
		Stack popStack = new Stack();
		popStack.push(new Entry(1));
		popStack.push(new Entry(2));
		popStack.pop();
		assertEquals(1, popStack.size());

	}

}
