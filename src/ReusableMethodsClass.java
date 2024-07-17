import org.testng.annotations.Test;

public class ReusableMethodsClass extends ReusableMethodsUtilities2Class {

	int a; // 'a' Class global variable

	// Create a 'constructor' method to initialize the class variables
	public ReusableMethodsClass(int a) { // Instant variable //Parameterized constructors
		super(a); // super is for invoke Parent class constructor. super should be first line in
					// the child constructor.
		this.a = a; // this.a refers the current class variable
	}

	@Test
	public int increment() {
		a = a + 1; // Variable 'a' refers the class variable 'a', where as constructor variable
					// (I.e int a) refers the value send through the object of the class.
		return a;
	}

	@Test
	public int decrement() {
		a = a - 1;
		return a;

	}

}
