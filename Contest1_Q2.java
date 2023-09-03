import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        int b=1;
        
       System.out.println(0);
        
       System.out.println(1+" "+1);
       
        for(int i=3;i<=n;i++){
            for(int j=0;j<i;j++){
                int c=a+b;
                System.out.print(c+" ");
                
                a=b;
                b=c;
               
            }
            System.out.println();
        }
        
    }
}
