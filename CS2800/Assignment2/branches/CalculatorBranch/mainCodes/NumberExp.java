package mainCodes;

public class NumberExp implements Calculator {

	private final float f; 
	
	public NumberExp(float f) {
		this.f = f;
	}

	@Override
	public float evaluate() {
		return f;
	}

}
