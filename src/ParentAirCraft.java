
public abstract class ParentAirCraft {

/*
Can consists of one or more abstract methods and one or more concrete methods; 
where as in Interface, all methods are abstract by default, have no body implementation.

******************************** Difference between Abstract and Interfaces ********************************
The abstract methods should not be Private, as it has to be implemented in the child class
Except private, abstract methods can have any access specifiers in abstract class.
Except private variable, can have any access specifiers.
To implement abstract, use 'extends' keyword.

Interface must have abstract methods
Methods must be Public
Variables can be public, default, protected.
To implement Interface, use 'implements' keyword.
******************************** Difference between Abstract and Interfaces ********************************
*
*
********************************************** Abstraction ********************************************** 
Abstraction:
Abstraction is the process of hiding implementation from details from the user. Only the functionality will be provided to the user.
the users will have the information on what the object does, instead of how it does.

Abstract Classes and Abstract methods:
Class which is declared with a keyword 'abstract is abstract class.
It can have abstract methods and non-abstract methods(i.e no body methods).

Abstract classes achieves partial abstraction.
Interfaces classes achieves 100% abstraction.
********************************************** Abstraction ********************************************** 

********************************************** Inheritance *******************************************
In Java,
* Multiple inheritance not possible
* 
* Class X{Class X members}
* 
* Class Y{Class Y members}
*  
* Class Z extends X, Y {Class Z members}    //Multiple inheritance of Parent classes not allowed
* 
* Class Z implements X, Y {} //Multiple implementations of Interfaces allowed
* 
* 
* 
* 

********************************************** Inheritance *******************************************

*/

public void engine(){
	
	System.out.println("Follow engine guidelines");
	
}

public void safetyGuidelines(){
	
	System.out.println("Follow safety guidelines");
}

public abstract void bodyColor(); //one method doesn't have body, It's responsibility of the child class to implement it. 


}