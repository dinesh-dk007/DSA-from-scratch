class Solution {
    public int maxDifference(String s) {
        int [] arr = new int [26];
        for(char i : s.toCharArray()){
            arr[i-'a']++;
        }
        int oddMax = 0;
        int evenMin = Integer.MAX_VALUE;
        for(int i = 0;i<26;i++){
            int frq = arr[i];
            if(arr[i]%2 == 0 && arr[i] != 0) evenMin = Math.min(frq,evenMin);
            else{
                oddMax = Math.max(oddMax,frq);
            }
        }
        return oddMax-evenMin;
    }
}