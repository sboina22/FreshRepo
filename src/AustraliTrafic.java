// to demo git Integration with ecclips
// 2nd change in the File Australia file 

public class AustraliTrafic  implements CentralTraffic, ContinentalInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a =	new AustraliTrafic(); //Create an object of the class and access the methods from implements class
		a.greenGo();
		a.redStop();
		a.flashYellow();
//****** Interfaces can not be initiated,. Instead, it must be implemented by a class.******
		AustraliTrafic at = new AustraliTrafic(); //to access methods from own class, needs to create an object of own class and access
		at.walkOnSymbol();
		
		at.greenGo();
		at.redStop();
		at.flashYellow();
		
		
		ContinentalInterface ct =  new AustraliTrafic();
		
		ct.trafficSymbol();
		at.trafficSymbol(); //also 
		
	}

	
	//own methods specific to the class can create/define here
	public void walkOnSymbol() {
		
		System.out.println("Walk on Symbol from own class method");
	}
		
	
	@Override
	public void greenGo() {
	
		System.out.println("Green Go Implimentation");
	}

	@Override
	public void redStop() {

		System.out.println("Red Stop Implimentation");
	}

	@Override
	public void flashYellow() {
	
		System.out.println("Flash Yellow Implimentation");
	}

	
	// ******** Methods from multiple Interfaces can implement here ********
	
	// Implementation of a method from Interface 2 
	@Override
	public void trafficSymbol() {   
		System.out.println("Traffic Symbol Implimentation for a method from Interface 2");
		
	}

}
