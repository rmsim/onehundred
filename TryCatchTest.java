import java.io.*;
import java.util.*;

public class TryCatchTest {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        try {
        	int one = s.nextInt();
        	int two = s.nextInt();
        	System.out.println(one / two);
        	// Try block to handle code that may cause exceptions

        } catch (ArithmeticException e) {
        	// This block is to catch divide-by-zero error
        	System.out.println("java.lang.ArithmeticException: / by zero");
        } catch (InputMismatchException e) {
        	// A try block can have many catches
        	System.out.println("java.util.InputMismatchException");

        }
    }
}