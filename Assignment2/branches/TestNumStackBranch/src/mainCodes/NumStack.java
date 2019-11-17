package mainCodes;

import java.util.Stack;

public class NumStack {
	
	public Stack<Float> numStack = new Stack(); 
	
	private float size = 0;

	public void push(float f) {	
		numStack.push(1f);
		size += 1;
	}

	public Boolean isEmpty() {
		return numStack.isEmpty();
	}

	public float pop() {
		return numStack.pop();
	}

	public float size() {
		return size;
	}

}
