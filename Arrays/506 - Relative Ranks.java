class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i = 0;i<n;i++){
            map.put(score[i],i);
        }
        int count = 1;
        String [] arr = new String[n];
        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            int ind = mp.getValue();
            if(count == n){
                arr[ind] = "Gold Medal"; 
            }else if(count == n-1){
                arr[ind] = "Silver Medal";
            }else if(count == n-2){
                arr[ind] = "Bronze Medal";
            }else{
                arr[ind] = ""+(n-count+1);
            }
            count++;
        }
        return arr;
    }
}