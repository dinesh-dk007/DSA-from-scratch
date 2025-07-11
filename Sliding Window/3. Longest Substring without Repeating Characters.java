class Solution {
    public int lengthOfLongestSubstring(String s) {
        char [] str = s.toCharArray();
        int [] hash = new int [256];
        for(int i = 0;i<256;i++)hash[i] = -1;
        int n = str.length;
        int left = 0;
        int right = 0;
        int maxlen = 0;
        while(right < n){
            if(hash[str[right]] != -1){
                if(hash[str[right]] >= left){
                    left = hash[str[right]]+1;
                }
            }
            hash[str[right]] = right;
            int len = right-left+1;
            maxlen = Math.max(maxlen,len);
            right++;
        }
        return maxlen;
    }
}