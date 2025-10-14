class Solution {
    static boolean helper(List<Integer> arr,int k,int start){
        for(int i = start;i<start+k-1;i++){
            if(arr.get(i) >= arr.get(i+1))return false;
        }
        return true;
    }
    public boolean hasIncreasingSubarrays(List<Integer> al, int k) {
        int n = al.size();
        int right = 0;
        int left = 0;
        while(right < n-k+1){
            while(right-left+1 < k && al.get(right) < al.get(right+1)){
                right++;
            }
            if(right-left+1 == k){
                if(right + k < n && helper(al,k,right+1)){
                    return true;
                }else{
                    left++;
                }
            }else{
                right++;
                left = right;
            }
        }
        return false;
    }
}