class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<String , String> map = new HashMap<>();
        int n = pattern.length();
        String [] str = s.split(" ");
        if(n != str.length)return false;
        for(int i = 0;i<n;i++){
            String key = pattern.charAt(i)+"";
            if(map.containsKey(key)){
                if(!map.get(key).equals(str[i])){
                    return false;
                }
            }else if(map.containsValue(str[i])){
                return false;
            }
            else{
                map.putIfAbsent(key,str[i]);
            }
        }
        return true;
    }
}