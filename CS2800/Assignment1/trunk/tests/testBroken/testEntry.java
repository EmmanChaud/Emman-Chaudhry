package testBroken;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import mainCode.BadTypeException;
import mainCode.Entry;
import mainCode.Symbol;
import mainCode.Type;

class testEntry {

  /**
   * TEST 1: Test to see if a Type can be returned
   * Type.NUMBER represents the float value entry, it shouldn't allow any other type other than NUMBER
   * @return Type.NUMBER and numEntry.getType() should return true
   */
  @Test
  void testType() {
    Entry numEntry = new Entry(Type.NUMBER);
    assertEquals(Type.NUMBER, numEntry.getType());
  }

  /**
   * TEST 2: Test for a String entry
   * Validates that a string can be used as an entry
   * @return return true for whenever an entry is a String
   * @throws BadTypeException for when an entry is not a string
   */
  @Test
  void testString() throws BadTypeException {
    Entry strEntry = new Entry("a");
    assertEquals("a", strEntry.getString());
  }

  /**
   * TEST 3: Test for a float entry
   * Validates that a float can be used as an entry
   * @return true for whenever entry is a float
   * @throws Exception for when entry is not a float
   */
  @Test
  void testValue() throws BadTypeException {
    Entry floEntry = new Entry(1f);
    assertEquals(1f, floEntry.getValue());
  }

  /**
   * TEST 4: Test to see if a Symbol can be returned
   * @param symEntry, used to create a new entry for a symbol input
   * @return True if strings are equal to each other
   */
  @Test
  void testSymbol() throws BadTypeException {
    Entry symEntry = new Entry(Symbol.LEFT_BRACKET);
    assertEquals("LEFT_BRACKET", symEntry.getSymbol().toString());

  }

  /**
   * TEST5: Test to see if a Symbol can be returned when the input is a symbol
   * 
   * @return true if the String symbols are equal to the getSymbol() method call
 * @throws BadTypeException, for when the entry type is not symbol
   */
  void testSymbolWhenInputIsSymbol() throws BadTypeException {
    Symbol symbol = Symbol.PLUS;
    Entry symEntry2 = new Entry(symbol);
    assertEquals("+", symEntry2.getSymbol());
  }
  
  /**
   * TEST 6: Test for when a String is null
   * @throws BadTypeException, has to be thrown when the input string is null
   * @param bad, represents a null string, tests the case when user types nothing
   */
  @Test
  void testStringWhenNull() {
	  String bad = null; 
  try {
      Throwable exception = assertThrows(BadTypeException.class, () -> {
        Entry badEntry = new Entry(bad);
        badEntry.getString();
      });
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  /** 
   * TEST 7: Tests two entries when they are not equal
   * Successful test should return true for both assertFalse and assertNotEquals
   * @throws BadTypeException, is thrown when the entries are equal
   */
  @Test
  void testNotEqual() throws BadTypeException {
	  Entry entry1 = new Entry("a");
	  Entry entry2 = new Entry("b");
	  assertFalse(entry1.equals(entry2));
	  assertNotEquals(entry1.hashCode(), entry2.hashCode());
  }
  
  /**
   * TEST 8: Tests two entries when they are equal
   * Successful test should return true 
   * @throws BadTypeException, is thrown when the entries are not equal
   */
  @Test
  void testEqual() throws BadTypeException {
	  Entry entry1 = new Entry("a");
	  Entry entry2 = new Entry("a");
	  assertTrue(entry1.equals(entry2));
	  assertEquals(entry1.hashCode(), entry2.hashCode());
  }
  


}


