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
         int nfact=fact(n);
         int rf=fact(r);
         int nmrf=fact(n-r);
        
        int npr=nfact/nmrf;
        int ncr=nfact/(nmrf*rf);
        System.out.println(nfact);
        System.out.println(npr);
        System.out.println(ncr);
        
    }
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            
            
            
        }
        return fact;
    }
}
