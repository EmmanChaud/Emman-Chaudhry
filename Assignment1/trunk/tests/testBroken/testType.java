package testBroken;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import mainCode.Type;

class testType {

  /**
   * Test to check if the Type enums match with their associated Strings
   * 
   * @return the enum names in a String format, while returning true if strings are equal
   */
  @Test
  void checkType() {
    String[] types = {Type.NUMBER.toString(), Type.SYMBOL.toString(), Type.STRING.toString(),
        Type.INVALID.toString()};
    String[] typeString = {"NUMBER", "SYMBOL", "STRING", "INVALID"};
    for (int i = 0; i < types.length; ++i) {
      System.out.println(types[i].toString());
      assertEquals(typeString[i], types[i].toString());
    }

  }

}


