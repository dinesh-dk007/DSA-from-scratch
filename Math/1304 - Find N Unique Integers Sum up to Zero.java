class Solution {
    public int[] sumZero(int n) {
        if(n == 1)return new int[]{0};
        int []arr = new int [n];
        if(n%2 != 0){
            int sum = 0;
            for(int i = 1;i<n;i++){
                arr[i] = i-1;
                sum += arr[i];
            }
            arr[0] = -sum;
        }else{
            int sum = 0;
            for(int i = 1;i<n;i++){
                arr[i] = i;
                sum +=i;
            }
            arr[0] = -sum;
        }
        return arr;
    }
}