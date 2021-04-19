// In Multiple inheritance ,one class can have more than one superclass and inherit features from all parent classes. Please note that Java does not support multiple inheritance with classes. In java, we can achieve multiple inheritance only through Interfaces. 


// Java program to illustrate the 
// concept of Multiple inheritance 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

interface one 
{ 
	public void print_geek(); 
} 

interface two 
{ 
	public void print_for(); 
} 

interface three extends one,two 
{ 
	public void print_geek(); 
} 
class child implements three 
{ 
	@Override
	public void print_geek() { 
		System.out.println("Geeks"); 
	} 

	public void print_for() 
	{ 
		System.out.println("for"); 
	} 
} 

// Drived class 
public class MultipleInheritance 
{ 
	public static void main(String[] args) 
	{ 
		child c = new child(); 
		c.print_geek(); 
		c.print_for(); 
		c.print_geek(); 
	} 
} 
