package stackClasses;

import mainCode.BadTypeException;
import mainCode.EmptyStackException;
import mainCode.Entry;
import mainCode.Stack;

public class NumStack {
	
	Stack numStack = new Stack(); 
	Entry entry = new Entry();
	private float size = 0;

	public void push(float f) {	
		numStack.push(new Entry(f));
		size += 1;
	}

	public Boolean isEmpty() {
		return numStack.isEmpty();
	}

	public float pop() throws BadTypeException, EmptyStackException {
		if (!isEmpty()) {
			size --;
			return numStack.pop().getValue();
		}
		throw new EmptyStackException();
	}

	public float size() {
		return size;
	}
	
}
