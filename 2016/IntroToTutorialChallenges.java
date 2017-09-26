/* Intro To Tutorial Challenges
* 3 lines of input: [1] Value that needs to be searched; [2] Size of array ; [3] numbers that make up the array
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        
        String searchS = s.nextLine();
        int search = Integer.parseInt(searchS);
        
        String sizeS = s.nextLine();
        int size = Integer.parseInt(sizeS);
        
        String str = s.nextLine();  
        String[] strArray = str.split("\\s+");
        int[] intArray = new int[strArray.length];
        for(int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        
        for (int i=0; i<size; i++) {
            if (intArray[i] == search) {
                System.out.println(i);
            }
        }
        
    }
}
