import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
        }
        System.out.println(dominindex(arr));
        
        }
    
    public static int dominindex(int[] arr){
        int max=Integer.MIN_VALUE;
        int index=-1;
        int second=-1;
    
    for(int i=0;i<arr.length;i++){
        if(arr[i] > max){
            second = max;
            max=arr[i];
            index=i;
        }
        else if(arr[i]>second){
            second=arr[i];
        }
    }
        return second *2<=max?index:-1;
    }
    
    
}
