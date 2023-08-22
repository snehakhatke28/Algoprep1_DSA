import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        if(PairSum(arr,k) == true){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }

    }
    
     public static boolean PairSum(int[] arr, int k) {
         int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : arr) {
            if(map.containsKey(num) == true){
                int temp = map.get(num);
                map.put(num,temp+1);
            }else{
                map.put(num,1);
            }
        }

        for(int i=0;i<n;i++){
            int a = arr[i];
            int b = k - a;
            
            if((a != b) && (map.containsKey(b)==true)){
                return true;
            }else if((a == b) && (map.get(b) > 1)){
                return true;
            }
        }
         
         return false;
    }

}
