import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
        int count=0;

        //Condition to count the number of factors
        for(int i=1;i<=num;i++){
            if(num%i==0) {
                count=count+1;
            }
            
        }
      //Decide whether the number is prime or not on the basis of count obtained.
        if(count==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        
    }
}
