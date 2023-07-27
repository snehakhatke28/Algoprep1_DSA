mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        //Take input
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        //apply condition to find out last digit
        
        while(num>0){
            int last_digit=num%10;
            
        //print last digit obtained
        System.out.print(last_digit);
               num=num/10;
        }
    }
}
