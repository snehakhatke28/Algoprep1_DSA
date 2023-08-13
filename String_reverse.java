import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String reversed = reverseString(str);
        System.out.println(reversed);
    }

    public static String reverseString(String str) {
        char[] ch = str.toCharArray();
        int n = str.length();
        
        int sp = 0;
        int ep = n - 1;
        
        while (sp < ep) {
            char temp = ch[sp];
            ch[sp] = ch[ep];
            ch[ep] = temp;
            sp++;
            ep--;
        }
        
        String ans = new String(ch);
        return ans;
    }
}
