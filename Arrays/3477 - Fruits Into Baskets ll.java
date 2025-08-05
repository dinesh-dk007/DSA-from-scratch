class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int m = baskets.length;
        int count = 0;
        for(int i : fruits){
            int flag = 0;
            for(int j = 0;j<m;j++){
                if(i <= baskets[j]){
                    flag = 1;
                    baskets[j] = 0;
                    break;
                }
            }
            if(flag == 0)count++;
        }
        return count;
    }
}