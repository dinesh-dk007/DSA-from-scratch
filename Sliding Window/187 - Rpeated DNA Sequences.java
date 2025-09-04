class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> al = new HashSet<>();
        HashSet<String> keys = new HashSet<>();
        int n = s.length();
        if(n < 10){
            return new ArrayList<>(al);
        }
        for(int i = 0;i<n-9;i++){
            if(!keys.add(s.substring(i,i+10))){
                al.add(s.substring(i,i+10));
            }
        }
        return new ArrayList<>(al);

    }
}