package testCode;

import mainCodes.NumStack;

class TestNumStack {

	@Test
	public void testPush() {
		NumStack tester = new NumStack();
		tester.push(1f);
		assertFalse(tester.isEmpty());
	}

}
