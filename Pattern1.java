import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    //Step1 taking input from user

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //NST technique application
        int nst=1;
         //Loop for number of rows
        for(int i=1;i<=num;i++){
         //Inner for number of stars
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
        //Next line preparation
            System.out.println();
                nst++;
        }
    }
}
