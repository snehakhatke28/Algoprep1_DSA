import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        
        boolean isPalindrome=checkPalindrome(str);
        System.out.println(isPalindrome);
    }
    
    public static Boolean checkPalindrome(String str){
         str = str.toLowerCase(); 
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
