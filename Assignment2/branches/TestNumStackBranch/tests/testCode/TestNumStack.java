package testCode;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import mainCode.Entry;
import mainCode.Stack;
import mainCodes.NumStack;

public class TestNumStack {

	@Test
	public void testPush() {
		NumStack tester = new NumStack();
		tester.push(1f);
		assertFalse(tester.isEmpty());
	}
	
	@Test
	public void testPop() {
		NumStack tested = new NumStack();
		tested.push(1f);
		tested.push(2f);
		tested.pop(); 
		assertEquals(2f, tested.size(), 0);
		}
	

}
