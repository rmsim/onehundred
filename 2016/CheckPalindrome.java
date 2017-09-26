/* Check if a string is a palindrome */
import java.io.*;
import java.util.*;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		StringBuilder reversed = new StringBuilder(A).reverse();

		if (A.compareTo(reversed.toString()) == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}


	}
}