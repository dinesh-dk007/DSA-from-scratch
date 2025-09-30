class Solution {
    public int triangularSum(int[] arr) {
        int n = arr.length;
        if(n == 1)return arr[0];
        while(n > 1){
            int [] brr = new int [n-1];
            for(int i = 1;i<n;i++){
                brr[i-1] = (arr[i-1]+arr[i])%10;
                //System.out.print(brr[i-1]+" ");
            }
            //System.out.println();
            n = n-1;
            arr = brr;
        }
        return arr[0];
    }
}