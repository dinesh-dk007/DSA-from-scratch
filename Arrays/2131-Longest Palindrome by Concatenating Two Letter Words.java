public class Solution {
    public int longestPalindrome(String[] words) {
        int[][] wordPairsCount = new int[26][26];
        int palindromeLength = 0;

        for (String word : words) {
            int firstCharIndex = word.charAt(0) - 'a';
            int secondCharIndex = word.charAt(1) - 'a';
            if (wordPairsCount[secondCharIndex][firstCharIndex] > 0) {
                palindromeLength += 4;
                wordPairsCount[secondCharIndex][firstCharIndex]--;
            } else {
                wordPairsCount[firstCharIndex][secondCharIndex]++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (wordPairsCount[i][i] > 0) {
                palindromeLength += 2;
                break;
            }
        }
        return palindromeLength;
    }
}