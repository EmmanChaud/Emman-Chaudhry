package application;

import mainCode.BadTypeException;
import mainCode.EmptyStackException;

public class Controller {
  Calculator c = Calculator.getInstance();
  ViewInterface myView = null;

  private void calculateAction() throws BadTypeException, EmptyStackException {
    float a = c.evaluate(myView.getQuestion());
    myView.setAnswer(String.valueOf(a));
  }

  private void changeType(OpType t) {
    myView.setAnswer("Changed to " + t);
  }

  public Controller(ViewInterface v) {
    myView = v;
    v.addCalcObserver(() -> {
      try {
        calculateAction();
      } catch (BadTypeException | EmptyStackException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    });
    v.addTypeObserver(this::changeType);
  }

}