class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        int [] map = new int [256];
        for(int i = 0;i<m;i++){
           map[t.charAt(i)]++;
        }
        char [] arr = s.toCharArray();
        int right =0;int left = 0;
        int maxlen = Integer.MAX_VALUE;
        int startIndex = -1;
        int count = 0;
        int endIndex = 0;
        while(right < n){
            if(map[arr[right]] > 0){
                count++;
            }
            map[arr[right]]--;
            while(count == m){
                if(right - left + 1 < maxlen){
                        maxlen = right-left+1;
                        startIndex = left;
                        endIndex = right;
                    }
                    map[arr[left]]++;
                    if(map[arr[left]] > 0)count--;
                    left++;
            }
            right++;
        }
        return startIndex == -1 ? "" : s.substring(startIndex,endIndex+1);
    }
}