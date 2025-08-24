class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        Map<Character,Integer> map = new HashMap<>();
        char [] arr = s.toCharArray();
        int maxlen = 0;
        int max = 0;
        while(right < s.length()){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            max = Math.max(map.get(arr[right]),max);
            int diff = (right-left+1) - max;
            if(diff > k){
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left]) == 0){
                    map.remove(arr[left]);
                }
                left++;
                max--;
            }
            if(diff <= k){
                maxlen = Math.max(right-left+1,maxlen);
            }
            right++;
        }
        return maxlen;
    }
}