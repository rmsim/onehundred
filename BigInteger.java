import java.io.*;
import java.util.*;
import java.math.*;

public class BigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger bi1, bi2, biadd, bimult;
        
        bi1 = new BigInteger (sc.nextLine());
        bi2 = new BigInteger (sc.nextLine());

        biadd = bi1.add(bi2);
        bimult = bi1.multiply(bi2);
        
        String addresult = biadd.toString();
        String multresult = bimult.toString();
        
        System.out.println(addresult);
        System.out.println(multresult);
    }
}