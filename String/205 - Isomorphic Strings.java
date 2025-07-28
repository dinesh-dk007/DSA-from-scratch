class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        if(n != t.length())return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(!map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i),i);
            }
            if(!map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i),i);
            }
            if(!map1.get(s.charAt(i)).equals(map2.get(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}