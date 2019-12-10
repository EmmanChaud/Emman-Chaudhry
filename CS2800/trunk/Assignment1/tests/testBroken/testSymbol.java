package testBroken;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import mainCode.Symbol;

class testSymbol {

  /**
   * TEST1 determine if Symbols can be returned as strings
   * 
   * @return true for when all strings and symbol strings are equal
   */
  @Test
  void test1() {
    Symbol[] symbols = {Symbol.LEFT_BRACKET, Symbol.RIGHT_BRACKET, Symbol.TIMES, Symbol.DIVIDE,
        Symbol.PLUS, Symbol.MINUS, Symbol.INVALID};
    String[] strSymbols =
        {"LEFT_BRACKET", "RIGHT_BRACKET", "TIMES", "DIVIDE", "PLUS", "MINUS", "INVALID"};
    for (int i = 0; i < symbols.length; i++) {
      System.out.println(symbols[i]);
      assertEquals(strSymbols[i], symbols[i].toString());
    }
     

  }

  /**
   * TEST2 determine if symbol strings can be assigned to symbol names
   * 
   * @return true for when getSymbol() matches with the correct symbol
   */
  @Test
  void test2() {
    Symbol symbolVal = Symbol.PLUS;
    assertEquals("+", symbolVal.getSymbol());
  }

}
