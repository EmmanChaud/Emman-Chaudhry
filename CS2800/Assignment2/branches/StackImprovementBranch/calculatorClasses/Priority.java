package calculatorClasses;

public class Priority {
  
  public int getPriority(String s) {
    int priority = 0;
    if (s.equals("+") || s.equals("-")) {
      priority = 1;
    } else if (s.equals("*") || s.equals("/")) {
      priority = 2;
    }
    return priority;
  }

}
