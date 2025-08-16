class Solution {
    public int getMin(int [] arr){
        int min =  Integer.MAX_VALUE;
        for(int i : arr){
            if(i != 0){
                min = Math.min(i,min);
            }
        }
        return min;
    }
    public int getMax(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            max = Math.max(max,i);
        }
        return max;
    }
    public int beautySum(String s) {
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            int [] arr = new int[26];
            for(int j = i;j<s.length();j++){
                arr[s.charAt(j)-'a']++;
                sum += getMax(arr)-getMin(arr);
            }
        }
        return sum;
    }
}