package calculatorClasses;

public class Priority {

  public static int getPriority(String s) {
    switch (s) {
      case "+":
      case "-":
        return 1;
      case "*":
      case "/":
        return 2;
    }
    return -1;
  }

}
