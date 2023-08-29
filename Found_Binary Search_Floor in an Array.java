import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        System.out.println(floor(arr, k));
    }

    public static int floor(int arr[], int k) {
        int lb = 0;
        int hb = arr.length - 1;

        int ans = Integer.MIN_VALUE;
        while (lb <= hb) {
            int m = (lb + hb) / 2;
            if(arr[m]==k){
                return k;
            }

            else if (arr[m] < k) {
                ans = arr[m];
                lb = m + 1;
            } else {
                hb = m - 1;
            }
        }

        return ans;
    }
}
