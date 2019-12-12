package calculatorClasses;

public class NumberExp implements Expression {

	private final float f; 
	
	public NumberExp(float f) {
		this.f = f;
	}

	@Override
	public float evaluate() {
		return f;
	}

}
