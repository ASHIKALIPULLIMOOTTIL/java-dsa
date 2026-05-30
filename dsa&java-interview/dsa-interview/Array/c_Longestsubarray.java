
package Array;
/*
public class Longestsubarray {
    public static void main(String[] args) {
        int a[]={2,2,5,0,0,3,9,9,7,7};
        int n=a.length;
        int t=3;
        int len=0;
        for(int i=0;i<n;i++){
            int sum=0;
           for(int j=i;j<n;j++){
            
            
                sum+=a[j];
                if(sum==t){
                    len=Math.max(len, j-i+1);
                
            }
            
           }
        }
        System.out.println(len);
    }
}

*/

import java.util.*;

public class c_Longestsubarray{
    public static void main(String[] args) {
        int a[]={2,2,5,0,0,3,9,9,7,7};
        int t=3;

        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for(int i=0;i<a.length;i++){
            sum += a[i];

            if(sum == t){
                maxLen = i + 1;
            }

            if(map.containsKey(sum - t)){
                maxLen = Math.max(maxLen, i - map.get(sum - t));
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }

        System.out.println(maxLen);
    }
}

/*

import java.util.*;

public class Longestsubarray{ {

    public static int longestSubarrayWithSumK(int[] a, int k) {
        int left = 0, right = 0;
        long sum = a[0];
        int maxLen = 0;
        int n = a.length;

        while (right < n) {

            // Shrink window if sum > k
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // Check if sum == k
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move right forward
            right++;
            if (right < n) {
                sum += a[right];
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = {2, 2, 5, 1, 1, 1, 9, 9, 7, 7};
        int k = 3;

        int result = longestSubarrayWithSumK(a, k);
        System.out.println(result);
        //TC=o(n)
    }
}

*/
