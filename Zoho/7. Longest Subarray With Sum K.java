import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int [n];
        int k = s.nextInt();
        for(int i = 0;i<n;i++)arr[i] = s.nextInt();
        int maxlen = 0;
        int left = 0;
        int right = 0;
        int sum = arr[0];
        while(right < n){
            while(left<=right && sum > k){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                maxlen = Math.max(maxlen,right-left+1);
            }
            right++;
            if(right < n) sum += arr[right];
        }
        System.out.print(maxlen);
    }
}