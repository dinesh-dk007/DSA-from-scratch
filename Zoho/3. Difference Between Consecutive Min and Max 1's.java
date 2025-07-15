import java.util.*;
public class Main {
    public static int diffOnes(int [] arr){
        int [] dp = new int [arr.length];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        dp[0] = (arr[0] == 1)? 1 : 0;
        for(int i = 1;i<arr.length;i++) {
            if (arr[i] == 1) {
                dp[i] = dp[i - 1] + 1;
                max = Math.max(max,dp[i]);
                min = Math.min(min,dp[i]);
            }
            
        }
        return max-min;
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int [n];
        for(int i = 0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.print(diffOnes(arr));
    }

}
