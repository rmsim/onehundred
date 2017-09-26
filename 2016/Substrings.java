/* First line will consist a string containing english alphabets 
* which has at most 1000 characters. 2nd line will consist an integer k.
* k, is the number of char in the substring.
*/

import java.io.*;
import java.util.*;

public class Substrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int substringLength = sc.nextInt();

        String[] substrings = new String[line.length() - substringLength + 1];
        for(int i=0; i <= (line.length() - substringLength); i++) {
            substrings[i] = line.substring(i, i + substringLength);
        }

        String minSS = substrings[0];
        String maxSS = substrings[0];
        for (int i=0; i<substrings.length; i++) {
            if (minSS.compareTo(substrings[i]) > 0) {
                minSS = substrings[i];
            }

            if (maxSS.compareTo(substrings[i]) <0) {
                maxSS = substrings[i];
            }
        }
        System.out.println(minSS);
        System.out.println(maxSS);
    }
}