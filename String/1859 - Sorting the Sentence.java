class Solution {
    public String sortSentence(String s) {
        Map<Integer,String> map = new TreeMap<>();
        for(String str : s.split(" ")){
            int key = str.charAt(str.length()-1)-'0';
            String value = str.substring(0,str.length()-1);
            map.put(key,value);
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Integer,String> mp : map.entrySet()){
            sb.append(mp.getValue()+" ");
        }
        //System.out.print(sb.toString());
        return sb.toString().trim();
    }
}