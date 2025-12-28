class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String> al = new ArrayList<>();
        if(n == 0)return al;
        StringBuilder sb= new StringBuilder();
        int right = 1;
        int start = nums[0];
        sb.append(start);
        while(right < n){
            while(right <  n && nums[right-1]+1 == nums[right])right++;
            if(right < n){
                if(start != nums[right-1]){
                    sb.append("->"+nums[right-1]);
                }
                al.add(sb.toString());
                sb.setLength(0);
                start = nums[right];
                sb.append(start);
            }
            right++;
        }
        if(sb.length() != 0){
            if(start != nums[n-1]){
                sb.append("->"+nums[n-1]);
            }
            al.add(sb.toString());
        }
        return al;
        
    }
}