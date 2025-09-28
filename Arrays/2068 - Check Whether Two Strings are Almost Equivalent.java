class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int [] arr = new int [26];
        for(char c : word1.toCharArray()){
            arr[c-'a']++;
        }
        for(char c : word2.toCharArray()){
            arr[c-'a']--;
        }
        for(int i : arr){
            if(i > 3 || i < -3)return false;
        }
        return true;

    }
}