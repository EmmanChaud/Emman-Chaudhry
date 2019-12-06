package testCodes;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mainCodes.Add;

class TestAdd {

	@Test
	void test() {
		Add tester = new Add();
		tester.add(3,4);
		assertTrue(tester.evaluate(), 7);
	}

}
