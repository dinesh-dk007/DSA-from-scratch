class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int n = trips.length;
        Arrays.sort(trips, (a, b) -> Integer.compare(a[1], b[1]));
        Map<Integer,Integer> map = new HashMap<>();
        int total_cap = 0;
        for(int i = 0;i<n;i++){
            total_cap += trips[i][0];
            for(Map.Entry<Integer,Integer> mp : map.entrySet()){
                int key = mp.getKey();
                if(key <= trips[i][1]){
                    total_cap -= mp.getValue();
                    map.put(key,0);
                }
            }
            if(total_cap > capacity){
                return false;
            }
            map.put(trips[i][2],map.getOrDefault(trips[i][2],0)+trips[i][0]);
        }
        return true;
    }
}