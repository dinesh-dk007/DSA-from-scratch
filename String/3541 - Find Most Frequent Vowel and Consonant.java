class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int maxVowel = 0;
        int maxCons =0;
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            if("aeiou".indexOf(c+"") != -1){
                maxVowel = Math.max(maxVowel,map.get(c));
            }else{
                maxCons = Math.max(maxCons,map.get(c));
            }
        }
        return maxVowel + maxCons;

    }
}