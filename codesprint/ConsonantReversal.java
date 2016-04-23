// Reverse consonant in each string
// positions of the vowels stay the same
import java.io.*;
import java.util.*;

public class ConsonantReversal {
  
  public static boolean isVowel(String c) {
    String vowels = "AEIOUaeiou";
    return vowels.contains(c);
  }

  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();

    for (int i = 0; i < n; i++) {
      String S = in.nextLine();
    }
    
    for (int j = 0; j < S.length(); j++) {
      char c = S.charAt(j);
      System.out.println(j + " " + c);
    }

  }
}
