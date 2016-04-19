class Arithmetic {
}

class Adder extends Arithmetic {
	int add (int n, int m) {
		return n+m;
	}
}

// Don't know why it doesn't run
public class JavaInheritance2 {     
	public static void main(String[] args) {
	//Create a new Adder object         
	Adder a = new Adder();         
	
	// Print the name of the superclass on a new line
	System.out.println("My super class is: " + a.getClass().getSuperClass().getName());         
	
	// Print the result of 3 calls to Adder's `add(int, int) `method as 3 space-separated integers:         
	System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");     
	} 
}
