import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
                   Scanner sc=new Scanner(System.in);
                   int n=sc.nextInt();
                   int count=0;
        for(int i=1;i*i<=n;i++){
           if(n%i==0){
               if(i!=n/i){
               count=count+2;
               }
               else{
                   count=count+1;
               }
           }

        }
                    System.out.print(count);
    }
}
