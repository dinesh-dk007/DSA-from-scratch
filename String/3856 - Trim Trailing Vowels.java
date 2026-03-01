class Solution {
    public String trimTrailingVowels(String s) {
        int n = s.length();
        int ind  = -1;
        for(int i = n-1;i>=0;i--){
            if(s.charAt(i) != 'a' &&  s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u'){
                ind = i;
                break;
            }
        }

        return ind == -1 ? "" :s.substring(0,ind+1);

    }
}