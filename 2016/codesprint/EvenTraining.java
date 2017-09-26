// 1 = days she trained
// 0 = days she did not train
//
// given n input = if n is even: print Yes & number of 1s
// else: print No & number of 1s

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EvenTraining {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    for (int a_i = 0; a_i < n; a_i++) {
      a[a_i] = in.nextInt();
    }

    int counter = 0;
    for (int a_j = 0; a_j < n; a_j++) {
      if (a[a_j] == 1) {
        counter++;
      }
    }
    
    if (counter%2 == 0) {
      System.out.println("Yes " + counter);
    } else {
      System.out.println("No " + counter);
    }
  }
}
