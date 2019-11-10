package testCode;


import static org.junit.Assert.assertFalse;

import org.junit.Test;

import mainCodes.NumStack;

public class TestNumStack {

	@Test
	public void testPush() {
		NumStack tester = new NumStack();
		tester.push(1f);
		assertFalse(tester.isEmpty());
	}

}
