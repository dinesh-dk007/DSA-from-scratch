class Solution {
    public int countKeyChanges(String s) {
        String str = s.toLowerCase();
        int n = s.length();
        int count = 0;
        for(int i = 1;i<n;i++){
            if(str.charAt(i) != str.charAt(i-1))count++;
        }
        return count;
    }
}