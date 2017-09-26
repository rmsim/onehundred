/* Using Regex, we can easily match or search for patterns in a text. Before
 * searching for a pattern, we have to specify one using some well-defined
 * syntax.

 * In this problem, you are given a pattern. You have to check whether the syntax
 * of the given pattern is valid. 
 * Learning what regex is here: https://www.youtube.com/watch?v=s_PfopWcMwI
 */ 

import java.util.Scanner; 
import java.util.regex.*;

public class PatternSyntaxChecker {   
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		for (int i = 0; i < testCases; i++) {
			String regex = in.nextLine();
			try {
				Pattern.compile(regex);
				System.out.println("Valid");
			} catch(PatternSyntaxException e) {
				System.out.println("Invalid");
			}
			
		}    
	} 
}

