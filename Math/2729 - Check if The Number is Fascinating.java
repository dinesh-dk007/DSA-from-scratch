class Solution {
    public boolean isFascinating(int n) {
        String res =  (n+"")+(n*2)+(n*3);
        int []arr = new int [10];
        if(res.length() < 9)return false;
        for(int i  =0;i<res.length();i++){
            char c = res.charAt(i);
            arr[c-'0']++;
            if(c == '0'){
                return false;
            }
            if(arr[c-'0'] > 1)return false;
        }
        return true;
    }
}