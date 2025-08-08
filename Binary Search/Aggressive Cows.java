/*Example 1:
Input Format: N = 6, k = 4, arr[] = {0,3,4,7,10,9}
Result: 3
Explanation: The maximum possible minimum distance between any two cows will be 3 when 4 cows are placed at positions {0, 3, 7, 10}. Here the distances between cows are 3, 4, and 3 respectively. 
We cannot make the minimum distance greater than 3 in any ways.

Example 2:
Input Format: N = 5, k = 2, arr[] = {4,2,1,3,6}
Result: 5
Explanation: 
The maximum possible minimum distance between any two cows will be 5 when 2 cows 
are placed at positions {1, 6}.*/

//******Code******//

import java.util.*;
public class Main {
    public static boolean canPlaceCows(int [] arr , int m,int cows){
        int count = 1;
        int last = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]-last >= m){
                last = arr[i];
                count++;
            }
        }
        if(count >= cows){
            return true;
        }else{
            return false;
        }
    }
    public static int aggressiveCows(int [] stables,int cows){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : stables){
            max = Math.max(max,i);
            min = Math.min(i,min);
        }
        Arrays.sort(stables);
        int left = 1;
        int right = max-min;
        int ans = 0;
        while(left <= right){
            int mid = (left+right)/2;
            if(canPlaceCows(stables,mid,cows)){
                ans =mid;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        System.out.print(aggressiveCows(arr, k));
    }
}