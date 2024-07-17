
public class ChildClassDemo extends ParentClassDemo{

public void colour() {
	System.out.println(color); // Property 'color' inherited from parent class
}

public void engine() {
	System.out.println("I am from child class");
}


	public static void main(String[] args) {  
 /* no methods should be 'declared' inside the Main, the start JVM execution method, 
  * only execution of public methods allowed after create an object of the class or directly call the static methods
*/
		ChildClassDemo cd =	new ChildClassDemo();
		
		cd.gear();
		cd.breakingSystem();
		cd.audio();
		
		cd.engine(); //child class method
		cd.colour();  //child class method, uses the parent class property
		
	}

}
