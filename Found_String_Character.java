import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
       Scanner scn = new Scanner(System.in);
       String s = scn.nextLine();
       char[] arr = s.toCharArray();
       
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] >= 'A' && arr[i] <= 'Z') {
               arr[i] = (char) (arr[i] + 32);
           } else {
               arr[i] = (char) (arr[i] - 32);
           }
       }
       System.out.println(new String(arr));
    }
}
