class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Map<Integer,Set<Integer>> map = new HashMap<>();
        int k = 1;
        for(int lang[] : languages){
            Set<Integer> hs = new HashSet<>();
            for(int i : lang){
                hs.add(i);
            }
            map.put(k++,hs);
        }
        int len = friendships.length;
        boolean [] canComm = new boolean[len];
        for(int i = 1;i<=n;i++){
            for(int j = 0;j<len;j++){
                int f1 = friendships[j][0];
                int f2 = friendships[j][1];
                if(map.get(f1).contains(i) && map.get(f2).contains(i)){
                    canComm[j] = true;
                }
            }
        }
        int min = len;
        for(int i = 1;i<=n;i++){
            Set<Integer> set = new HashSet<>();
            for(int j = 0;j<len;j++){
                if(!canComm[j]){
                    int f1 = friendships[j][0];
                    int f2 = friendships[j][1];
                    if(!map.get(f1).contains(i)){
                        set.add(f1);
                    }
                    if(!map.get(f2).contains(i)){
                        set.add(f2);
                    }
                }
            }
            min = Math.min(min,set.size());
        }
        return min;

    }
}