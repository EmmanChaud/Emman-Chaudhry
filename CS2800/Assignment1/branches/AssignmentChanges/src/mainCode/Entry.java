package mainCode;

public class Entry {

	private float number;
	private String str;
	private Type type;
	private Symbol symbol;

	public Entry() {
	}

	/**
	 * Constructors that creates entries based on the fields above
	 * The field number being assigned to value allows us to refer to this entry of value for the getValue() method
	 * @param value, represents a number entry
	 * @param type, assigns the specific type for value is NUMBER and not any other type
	 */
	public Entry(float value) {
		this.number = value;
		type = Type.NUMBER;
	}

	/**
	 * String entry constructor
	 * @param str, represents a string entry
	 * @throws BadTypeException 
	 */
	public Entry(String str) throws BadTypeException {
		if (str instanceof String) {
			this.str = str;
			type = Type.STRING;
		} else {
			throw new BadTypeException();
		}
	}

	/**
	 * Type entry constructor
	 * 
	 * @param type, represents a type entry
	 */
	public Entry(Type type) {
		this.type = type;
	}

	/**
	 * Symbol entry constructor
	 * 
	 * @param symbol, represents a symbol entry
	 */
	public Entry(Symbol symbol) {
		this.symbol = symbol;
		type = Type.SYMBOL;
	}

	/**
	 * Gets the specified field variables and returns it
	 * 
	 * @return type
	 */
	public Type getType() {
		return type;
	}

	/** 
	 * Method retrieves the string from the Entry String constructor
	 * @return str, the string initialised from constructor
	 * @throws BadTypeException, thrown when the Type is not of Type.STRING, any other entry type will cause the exception to be thrown
	 */
	public String getString() throws BadTypeException {
		if (getType() != Type.STRING) {
			throw new BadTypeException();
		}
		return str;
	}

	/**
	 * Method retrieves the float value from the Entry float constructor 
	 * @return number, the float initialised from the constructor
	 * @throws BadTypeException, thrown when the type is not of Type.NUMBER
	 */
	public float getValue() throws BadTypeException {
		if (getType() != Type.NUMBER) {
			throw new BadTypeException();
		}
		return number;
	}

	/**
	 * Method retrieves the Symbol input from the Entry symbol constructor
	 * @return symbol, the symbol initialised from the constructor 
	 * @throws BadTypeException, thrown when the type is not of Type.SYMBOL
	 */
	public Symbol getSymbol() throws BadTypeException {
		if (getType() != Type.SYMBOL) {
			throw new BadTypeException();
		}
		return symbol;
	}

	/**
	 * We override hashcode as we are also overriding the equals method, otherwise the general contract for Objects.hashcode() would be violated
	 * This hashcode method returns a hashcode for a particular string
	 * This is useful as when two Entries are equal, we can compare the hashcodes to determine if they are equal as they would both return the same hashcode
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(number);
		result = prime * result + ((str == null) ? 0 : str.hashCode());
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	/**
	 * Used to make an equal comparison between two objects
	 * This will help determine if two entries have the same instance and not just the 'Object' 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entry other = (Entry) obj;
		if (Float.floatToIntBits(number) != Float.floatToIntBits(other.number))
			return false;
		if (str == null) {
			if (other.str != null)
				return false;
		} else if (!str.equals(other.str))
			return false;
		if (symbol != other.symbol)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

}
