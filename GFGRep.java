 import java.io.*; 
class GFGRep { 
	public static void main(String[] args) 
	{ 
		StringBuffer s = new StringBuffer("GeeksforGeeks"); 
		s.replace(5, 8, "are"); 
		System.out.println(s); // returns GeeksareGeeks 
	} 
} 
