class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer>  map = new HashMap<>();
        map.put(0,-1);
        int one = 0;
        int ans = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] == 1){
                one++;
            }else{
                one--;
            }
            if(map.containsKey(one)){
                ans = Math.max(ans,i-map.get(one));
            }else{
                map.put(one,i);
            }
        }
        return ans;
    }
}