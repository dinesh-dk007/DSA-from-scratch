class Solution {
    public int maxLen(int[] arr) {
        // Your code goes here
        int n =arr.length;
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
          sum += arr[i];
          if(sum == 0){
            maxLen = i+1;
          }else{
            if(map.get(sum) != null){
              maxLen = Math.max(maxLen,i - map.get(sum));
            }else{
              map.put(sum,i);
            }
          }
        }
        return maxLen;
    }
}
