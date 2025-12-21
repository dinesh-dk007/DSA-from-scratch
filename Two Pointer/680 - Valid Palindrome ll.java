class Solution {
    public boolean helper(int left,int right,String s){
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;right--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left <= right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else{
                return helper(left,right-1,s) || helper(left+1,right,s);
            }
        }
        return true;
    }
}