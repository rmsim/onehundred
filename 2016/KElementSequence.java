/* Find K number of sequences that will add up to N
 * given N and K as the input
 */
import.java.util.*;
import.java.io.*;

public class KElementSequence {
  public static void main (Strings[] args) {
    Scanner s = new Scanner(System.in);
    int testcases = s.nextInt();

    int iterations = 0;
    while (iterations < testcases) {
      String stringTest = s.nextLine();
      String[] stringTestNK = str.split("\\s+");
      int[] intTestNK = new int[stringTestNK.length];
      for (int i = 0; i < stringTestNK.length; i++) {
        intTestNK[i] = Integer.parseInt(stringTestNK[i]);
      }
      
      int N = intTestNK[0];
      int K = intTestNK[2];
      if (N <= K) {
        //Actual Math
        //Print out results
      }
  }
}
