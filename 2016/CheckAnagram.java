import java.io.*;
import java.util.*;

public class CheckAnagram {

   static boolean isAnagram(String A, String B) {
        // ASCII TABLE! Ordering is important
        A = A.toLowerCase();
        B = B.toLowerCase();

        char[] word1 = A.toCharArray();
        char[] word2 = B.toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        A = new String(word1);
        B = new String(word2);



        return A.compareTo(B) == 0;
   }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
