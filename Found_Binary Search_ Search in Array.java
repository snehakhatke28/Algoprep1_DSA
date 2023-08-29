import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int k=sc.nextInt();
        System.out.println(presentOrNot(arr,k));
    }
    public static boolean presentOrNot(int[] arr, int k){
        int lowerbound=0;
        int higherbound=arr.length-1;
        
        while(lowerbound<=higherbound){
            int m=(lowerbound+higherbound)/2;
            
            if(arr[m]==k){
                return true;
            }
            else if(arr[m]<k){
                lowerbound=m+1;
            }
            else{
                higherbound=m-1;
            }
            
        }
        return false;
    }
}
