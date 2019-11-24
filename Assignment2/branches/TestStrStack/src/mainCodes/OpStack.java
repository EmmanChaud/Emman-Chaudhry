package mainCodes;

import mainCode.BadTypeException;
import mainCode.EmptyStackException;
import mainCode.Entry;
import mainCode.Stack;
import mainCode.Symbol;

public class OpStack {
	
	Stack opStack = new Stack(); 
	Entry entry = new Entry();
	private float size = 0;

	public void push(Symbol i) {
		opStack.push(new Entry(i));
		size += 1;
		
	}

	public boolean isEmpty() {
		return opStack.isEmpty();
		}

	public Symbol pop() throws BadTypeException, EmptyStackException {
		if (!isEmpty()) {
			size --;
			return opStack.pop().getSymbol();
		}
		throw new EmptyStackException();
		
	}

	public float size() {
		return size;
	}

	public Symbol getSymbol() throws BadTypeException, EmptyStackException {
		return opStack.pop().getSymbol();
		
	}

}
