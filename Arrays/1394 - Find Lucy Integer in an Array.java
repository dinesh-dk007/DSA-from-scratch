class Solution {
    public int findLucky(int[] arr) {
        int li = -1;
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            int count = 1;
            if(!map.containsKey(arr[i])){
                for(int j = i+1;j<n;j++){
                    if(arr[i] == arr[j]){
                        count++;
                    }
                }
                map.put(arr[i],count);
            }
        }
        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            if(mp.getKey() == mp.getValue()){
                li = Math.max(li,mp.getKey());
            }
        }
        return li;
    }
}