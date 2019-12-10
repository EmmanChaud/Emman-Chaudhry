package stackClasses;

import mainCode.BadTypeException;
import mainCode.EmptyStackException;
import mainCode.Entry;
import mainCode.Stack;


public class StrStack {

	Stack strStack = new Stack(); 
	Entry entry = new Entry();
	private float size = 0;


	public void push(String string) throws BadTypeException {
		strStack.push(new Entry(string));
		size += 1;		
	}

	public boolean isEmpty() {
		return strStack.isEmpty();
	}

	public String pop() throws EmptyStackException, BadTypeException {
		if (!isEmpty()) {
			size --;
			return strStack.pop().getString();
		}
		throw new EmptyStackException();
	}

	public float size() {
		return size;
	}

	public String getString() throws BadTypeException, EmptyStackException {
		return strStack.pop().getString().toString();
	}
}
