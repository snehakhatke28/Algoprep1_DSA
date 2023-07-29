import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        int nst=1;
        int nsp=num/2;
        int r=num/2;
        
        for(int i=1;i<=num;i++){
            
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("*");
            }
             if (i<=r){
                nsp--;
                nst=nst+2;
                
            }
            else{
                nst=nst-2;
                nsp++;
            }
            System.out.println();
        
            
        }
        
    }
    
}
