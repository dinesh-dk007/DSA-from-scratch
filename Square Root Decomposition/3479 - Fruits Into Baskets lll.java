class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;
        int n = baskets.length;
        int sec = (int)Math.sqrt(n);
        List<Integer> al = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int cnt  = 0;
        for(int i = 0;i<n;i++){
            if(cnt == sec){
                al.add(max);
                max = baskets[i];
                cnt = 1;
            }else{
                cnt++;
                max = Math.max(max,baskets[i]);
            }
        }
        al.add(max);
        for(int i = 0;i<n;i++){
            int k = 0;
            int  size = 1;
            for(int j = 0;j<n;j+=sec){
                if(al.get(k) < fruits[i]){
                    k++;
                    continue;
                }
                for(int l = j;l<Math.min(j+sec,n);l++){
                    if(fruits[i] <= baskets[l]){
                        baskets[l] = 0;
                        size = 0;
                        break;
                    }
                }
                if(size == 0){
                    al.set(k, 0);
                    for(int l = j;l<Math.min(j+sec,n);l++){
                        al.set(k,Math.max(baskets[l],al.get(k)));
                    }
                    break;
                }
            }
            count += size;
        }
        return count;
    }
}