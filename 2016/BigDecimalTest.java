import java.math.BigDecimal;
import java.util.*;

class BigDecimalTest{
    public static void main(String[] args) {
    //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }

        //Write your code here
  
      
        //Output
        for(int i=0;i<n;i++) {
            System.out.println(s[i]);
        }
    }
}
