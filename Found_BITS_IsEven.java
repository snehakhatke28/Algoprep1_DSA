import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int N=sc.nextInt();
        
        if((N&1)==0){
            System.out.print("even");
        }
        else{
            System.out.print("odd");
        }
    }
}
