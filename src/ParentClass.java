import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParentClass {

	@BeforeMethod
	public void beforeRun() {
		System.out.println("I am from parent - @BeforeMethod");
	}

	// Regular parent class method..no need of @Test
	public void doThis() {
		System.out.println("I am from parent - regular method");

	}

	@AfterMethod
	public void afterRun() {
		System.out.println("I am from parent - @AfterMethod");
	}

}
