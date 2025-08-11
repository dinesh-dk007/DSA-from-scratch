class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] arr = new int [k];
        Map<Integer,Integer> map1 = new HashMap<>();
        for(int i :nums){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        Map<Integer,List<Integer>> map2 = new HashMap<>();
        for(int n : map1.keySet()){
            int val = map1.get(n);
            if(!map2.containsKey(val)){
                map2.put(val,new ArrayList<Integer>());
            }
            map2.get(val).add(n);
        }
        int ind = 0;
        for(int i = nums.length;i>=1;i--){
            if(map2.containsKey(i)){
                for(int l : map2.get(i)){
                    if(ind < k){
                        arr[ind++] = l;
                    }else{
                        break;
                    }
                }
            }
            if(ind >= k)break;
        }
        return arr;
    }
}