package mainCodes;

import mainCode.BadTypeException;
import mainCode.EmptyStackException;

public class RevPolishCalc {
	
	NumStack values = new NumStack();

	public float evaluate(String a) {
		float f = Float.parseFloat(a);
		values.push(f);
		return f;
		
	}

	public float getValue() throws BadTypeException, EmptyStackException {
		return values.pop();
	}

}
