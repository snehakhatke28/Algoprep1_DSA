import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(PS(n));
    }
    public static int PS(int n){
        int sum=0;
        int mul=1;
        
        while(n>0){
            int r=n%10;
            sum=sum+r;
            mul=mul*r;
            n=n/10;
            
            
        }
        return mul-sum;
    }
}
