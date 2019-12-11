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
	private Entry first; 
	

	public void push(Symbol symbol) {
		opStack.push(new Entry(symbol));
		size += 1;		
	}

	public boolean isEmpty() {
		return opStack.isEmpty();
	}

	public Symbol pop() throws EmptyStackException, BadTypeException {
		if (!isEmpty()) {
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

  public String peek() throws EmptyStackException, BadTypeException {
      return opStack.top().toString();
}
}
