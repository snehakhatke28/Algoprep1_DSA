import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int fact=1;
        int fact1=1;
        int fact2=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        for(int i=r;i>=1;i--){
            fact2=fact2*i;
        }
        for(int i=n-r;i>=1;i--){
            fact1=fact1*i;
        }
        int p=0;
        p=fact/fact1;
        int c=0;
        c=fact/(fact1*fact2);
       System.out.println(fact);
        System.out.println(p);
        System.out.println(c);
    
    }
     
}
