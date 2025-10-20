class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n = 0;
        for(String str : operations){
            if(str.contains("+"))n++;
            else n--;
        }
        return n;
    }
}