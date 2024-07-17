
public class ChildEmirites extends ParentAirCraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmirites c = new	ChildEmirites();
		
		c.safetyGuidelines();    //Parent class method; Here Parent class may be Interface, Abstract class, or regular class 
		c.engine();				//Parent class method
		c.bodyColor();			//Child class method
		
		// ParentAirCraft pt = new ParentAirCraft(); //***** If parent class is an Abstract class, we can't instantiate it, means can't create an object. 
		//We can not instantiate object for Abstract class.
		
	}

	@Override
	public void bodyColor() {
		System.out.println("Red color on the body");
		
	}
}

