class Solution {
    public int getInd(int x,int arr[]){
        int left = 0;
        int right = arr.length-1;
        int ind = -1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(arr[mid] >= x){
                ind = mid;
                right = mid-1;
            }else{
                left =  mid+1;
            }
        }
        return ind == -1 ? arr.length : ind;
    }
    public int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0;
        int right = n;
        int ans = 0;
        while(left <= right){
            int mid = left+(right-left)/2;
            int ind = getInd(mid,citations);
            int rem = n-ind;
            //System.out.println(rem+" "+mid+" "+ind);
            if(rem >= mid){
                ans = mid;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }
}