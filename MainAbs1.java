/*
 Like C++, an abstract class can contain constructors in Java. And a constructor of abstract class is called when an instance of a inherited class is created. For example, the following is a valid Java program.
*/


// An abstract class with constructor 
abstract class Base { 
	Base() { System.out.println("Base Constructor Called"); } 
	abstract void fun(); 
} 
class Derived extends Base { 
	Derived() { System.out.println("Derived Constructor Called"); } 
	void fun() { System.out.println("Derived fun() called"); } 
} 
class MainAbs1 { 
	public static void main(String args[]) { 
	Derived d = new Derived(); 
	} 
} 
