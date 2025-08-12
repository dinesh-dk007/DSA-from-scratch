class Solution {
    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c=='i' || c == 'o' || c == 'u';
    }
    public int maxVowels(String s, int k) {
        int n = s.length();
        int max = 0;
        int count = 0;
        int left = 0;
        int right = 0;
        while(right < k){
            if(isVowel(s.charAt(right))){
                count++;
            }
            right++;
        }
        max = count;
        while(right < n){
            if(isVowel(s.charAt(right++))){
                count++;
            }
            if(isVowel(s.charAt(left++))){
                count--;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}