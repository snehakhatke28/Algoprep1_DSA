import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scannner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int mul=1;
        int t=0;
        for(int i=0;i<n;i++){
            t=n%10;
            sum=sum+t;
            mul=mul*t;
            n=n/10;
            
        }
         int req=mul-sum;
        System.out.print(req);
    }
}
