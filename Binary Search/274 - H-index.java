class Solution {
    public int helper(int arr[],int val){
        int count  =0;
        for(int i : arr){
            if(i >= val)count++;
        }
        return count;
    }
    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        int left =1;
        int right = n;
        int max =0;
        while(left <= right){
            int mid =(left+right)/2;
            int citi = helper(citations,mid);
            if(citi >= mid){
                max= Math.max(max,mid);
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return max;
    }
}