import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        int nsp=1;
        int nst=(num/2)+1;
        
        for(int i=1;i<=num;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=nst;l++){
                System.out.print("*");
            }
        
            if(i<=num/2){
                nst--;
                nsp=nsp+2;
                
            }
            else{
                
                 nst++;
                nsp=nsp-2;
               
            }
            System.out.println();
               }   
        
    }
     
}
