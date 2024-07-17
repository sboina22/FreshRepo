import org.testng.annotations.Test;

public class ChildClass extends ParentClass {

	@Test
	public void testRun() {
		System.out.println("I am from child");
		
		doThis(); // Call directly the parent class method.
		
		ParentClass objParent = new ParentClass();
		objParent.doThis(); //call the method by create an object of the class
		
		ReusableMethodsClass ruobj = new ReusableMethodsClass(3); //If you wants to pass an argument with an object, then needs to create a constructor for that class.
	
		System.out.println(ruobj.increment());
		
		System.out.println(ruobj.decrement());
		
		//ReusableMethodsUtilities2Class ruobj2 = new ReusableMethodsUtilities2Class(3);
		System.out.println(ruobj.multiplyByFour());
	}

}
