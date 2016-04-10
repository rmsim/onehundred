import java.io.*;
import java.util.*;

public class JavaStringToken {  
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String s=scan.nextLine();
      s = s.replaceAll("[!,?._'@]"," ").trim();
      String[] words = s.split("\\s+");
      ArrayList<String> filteredWords = new ArrayList<String>();
      
      for (int i=0; i<words.length; i++) {
        if (words[i].compareTo("") != 0) {
            filteredWords.add(words[i]);
        }
      }

      System.out.println(filteredWords.size());
      for (String word : filteredWords) {
        System.out.println(word);
      }
    }
}
