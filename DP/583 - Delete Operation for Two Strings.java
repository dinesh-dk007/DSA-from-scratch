class Solution {
    public int LCS(String str1,String str2){
        int n = str1.length();
        int m = str2.length();
        int []prev = new int [m+1];
        for(int i = 1;i<=n;i++){
            int [] curr = new int [m+1];
            for(int j = 1;j<=m;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    curr[j] = 1 + prev[j-1];
                }else{
                    curr[j] = Math.max(curr[j-1],prev[j]);
                }
            }
            prev = curr;
        }
        return prev[m];
    }
    public int minDistance(String word1, String word2) {
        int len =LCS(word1,word2);
        return word1.length()+word2.length()-(2*len);
    }
}