import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int v=1;
        int r=1;
        
        while(v*v<=num){
            r=v;
            v++;
        }
        if(r*r==num){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        
    }
