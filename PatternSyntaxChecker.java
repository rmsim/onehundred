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
		regexChecker("[A-Z]\\[\\]\\(\\.\\+\\)", pattern);
		while(testCases>0) {
			String pattern = in.nextLine();
			if (regexChecker == "true") {
				System.out.println("Valid");

			}  else {
				System.out.println("Invalid");
			}     
		}    
	}

	public static void regexChecker (String theRegex, String pattern) {
		Pattern checkRegex = pattern.compile(theRegex);
		Matcher regexMatcher = checkRegex.matcher(pattern);

		while(regex.Matcher.find()) {
			if (regex.Matcher.group().length() != 0) {
				System.out.println(regexMatcher.group().trim());
				System.out.println("true");
			} 


		}

	} 
}

