class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(char c : s.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        //System.out.print(map1);
        TreeMap<Integer,List<Character>> map2 = new TreeMap<>();
        for(Map.Entry<Character,Integer> mp : map1.entrySet()){
            List<Character> al = map2.getOrDefault(mp.getValue(),new ArrayList<>());
            al.add(mp.getKey());
            map2.put(mp.getValue(),al);
        }
        //System.out.print(map2);
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Integer,List<Character>> mk : map2.entrySet()){
            int k = mk.getKey();
            for(Character i : mk.getValue()){
                for(int j = 0;j<k;j++){
                    sb.append(i);
                }
            }
        }
        return sb.reverse().toString();
    }
}