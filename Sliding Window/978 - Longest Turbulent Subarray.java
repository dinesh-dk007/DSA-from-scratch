class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        int maxLen = 1;
        int count = 1;
        for(int i = 0;i<n;i++){
            if(i >=2 && ((arr[i-2] > arr[i-1] && arr[i-1] < arr[i]) || (arr[i-2] < arr[i-1] && arr[i-1] > arr[i]))){
                count++;
            }
            else if(i >= 1 && arr[i] != arr[i-1]){
                count = 2;
            }else{
                count = 1;
            }
            maxLen = Math.max(maxLen,count);
        }
        return maxLen;
        
    }
}