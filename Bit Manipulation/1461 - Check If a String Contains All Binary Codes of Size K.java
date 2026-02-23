class Solution {
    public boolean hasAllCodes(String s, int k) {
        int res = 1 << k;
        HashSet<String> hs = new HashSet<>();
        int n = s.length();
        if(n < k)return false;
        for(int i = 0;i<n-k+1;i++){
            String temp =s.substring(i,i+k);
            hs.add(temp);
            if(hs.size() == res) return true;
        }
        return false;
    }
}