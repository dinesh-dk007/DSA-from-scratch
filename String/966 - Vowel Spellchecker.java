class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> hs = new HashSet<>();
        Map<String,String> map1 = new LinkedHashMap<>();
        Map<String,String> map2 = new LinkedHashMap<>();
        for(String word : wordlist){
            hs.add(word);
            map1.putIfAbsent(word.toLowerCase(),word);
            map2.putIfAbsent(word.toLowerCase().replaceAll("[aeiou]","*"),word);
        }
        String [] strs = new String[queries.length];
        int ind = 0;
        for(String str : queries){
            if(hs.contains(str)){
                strs[ind++] = str;
                continue;
            }else if(map1.containsKey(str.toLowerCase())){
                strs[ind++] = map1.get(str.toLowerCase());
                continue;
            }else if(map2.containsKey(str.toLowerCase().replaceAll("[aeiou]","*"))){
                strs[ind++] = map2.get(str.toLowerCase().replaceAll("[aeiou]","*"));
                continue;
            }else{
                strs[ind++] = "";
            }
        }
        return strs;
    }
}