import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      //Taking input from user
       Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
      //Taking required variables for NST METHOD
        int nst=1;
        int digit=1;
      //Loop for row
        for(int i=1;i<=num;i++){
          //For stars
            for(int j=1;j<=nst;j++){
                System.out.print(digit+" ");
                digit++;
                
            }
        //Prep for next line
            System.out.println();
            nst++;
            
        }
    }
}
