package mainCode;

import java.util.ArrayList;
import java.util.List;

public class Stack {

	/**
	 * Create a list of entries to store elements from the stack
	 */
	List<Entry> stackList = new ArrayList<Entry>();

	private int size = 0;

	/**
	 * Constructor to create new Stacks
	 */
	public Stack() {

	}

	/**
	 * Method checks if a Stack is empty, 
	 * 
	 * @return true if stack is equal to zero, false if otherwise
	 */
	public Boolean isEmpty() {
		return stackList.size() == 0;
	}

	/**
	 * Pushes a new element onto a stack, increments the stack by 1
	 * 
	 * @param entry, Defines as the element that is pushed onto the stack
	 */
	public void push(Entry entry) {
		stackList.add(entry);
		size += 1;
	}

	/**
	 * Pops the newest element from the stack and returns it's value
	 * @throws EmptyStackException
	 * 					exception is thrown if the stack is empty
	 */
	public Entry pop() throws EmptyStackException {
		if (!isEmpty()) {
			Entry topEntry = stackList.get(size - 1);
			stackList.remove(topEntry);
			size--;
			return topEntry;
		}
		throw new EmptyStackException();
	}

	/**
	 * This method retrieves the top entry from the stack without removing it
	 * @return the top entry
	 * @throws EmptyStackException
	 * 					exception is thrown if stack is empty
	 */
	public Entry top() throws EmptyStackException {
		if (!isEmpty()) {
			Entry topEntry = stackList.get(size - 1);
			return topEntry;
		}
		throw new EmptyStackException();
	}

	/**
	 * Method used to retrieve the size of the stack
	 * @return size, returned as an int value
	 */
	public int size() {
		return size;
	}

}
