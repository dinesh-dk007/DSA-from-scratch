class Solution {
    public int maxIncreasingSubarrays(List<Integer> al) {
        int n = al.size();
        if(n <= 1)return 0;
        int prev = 0;
        int count = 1;
        int ans = 0;
        int i = 1;
        while(i < n){
            if(al.get(i) > al.get(i-1)){
                count++;
            }else{
                ans = Math.max(ans,Math.min(prev,count));
                ans = Math.max(ans, count / 2);
                prev =count;
                count = 1;
            }
            i++;
        }
        ans = Math.max(ans,Math.min(prev,count));
        ans = Math.max(ans,count/2);
        return ans;
    }
}