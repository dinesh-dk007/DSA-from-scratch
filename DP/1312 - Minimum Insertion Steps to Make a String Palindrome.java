class Solution {
    public int LCS(String str1,String str2){
        int n = str1.length();
        int [] prev =new int [n+1];
        for(int i =1;i<=n;i++){
            int [] curr = new int [n+1];
            for(int j = 1;j<=n;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    curr[j] = 1+prev[j-1];
                }else{
                    curr[j] = Math.max(curr[j-1],prev[j]);
                }
            }
            prev = curr;
        }
        return prev[n];
    }
    public int longestPalindromeSubseq(String s) {
        String str1 = s;
        String str2 =  new StringBuilder(s).reverse().toString();
        return LCS(str1,str2);
    }
    public int minInsertions(String s) {
        return s.length() - longestPalindromeSubseq(s);
    }
}