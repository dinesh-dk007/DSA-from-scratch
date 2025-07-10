class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int val = map.get(c);
                map.put(c,val+1);
            }else{
                map.putIfAbsent(c,1);
            }
        }
        int count = 0;
        int flag = 0;
        for(int mp : map.values()){
            if(mp%2 == 0){
                count += mp;
            }else{
                count += mp-1;
                flag = 1;
            }
        }
        if(flag == 1) count++;
        return count;
    }
}