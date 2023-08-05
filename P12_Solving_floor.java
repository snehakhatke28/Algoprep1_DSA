import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int ans=0;
        while(i*i<=n){
            ans=i;
            i++;
        }
         System.out.println(ans);
    }
   
}
