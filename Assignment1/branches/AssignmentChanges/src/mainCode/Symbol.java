package mainCode;

public enum Symbol {
  LEFT_BRACKET("("), RIGHT_BRACKET(")"), TIMES("*"), DIVIDE("\""), PLUS("+"), MINUS("-"), INVALID(
      "INVALID");

  private String symbol;

  /**
   * Constructor to assign a String to the String 'symbol'
   * 
   * @param symbol
   */
  Symbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   * Method to return the symbol based on the constructor
   * 
   * @return symbol in a string format, i.e PLUS will return '+'
   */
  public String getSymbol() {
    return symbol;
  }

}
