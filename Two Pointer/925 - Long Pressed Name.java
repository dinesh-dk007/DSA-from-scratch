class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n = name.length();
        int m = typed.length();

        int p1 = 0,p2= 0;
        while(p1 < n && p2 < m){
            int c1 = 0;
            char c = name.charAt(p1);
            while(p1 < n && name.charAt(p1) == c){
                p1++;
                c1++;
            }
            int c2 = 0;
            while(p2 < m && typed.charAt(p2) == c){
                p2++;
                c2++;
            }
            if(c2-c1 < 0)return false;
        }
        return p1 == n && p2 == m;
    }
}