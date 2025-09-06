class Solution {
    public long minOperations(int[][] queries) {
        long res = 0;
        int n = queries.length;
        for(int i = 0;i<n;i++){
            long start = queries[i][0];int end = queries[i][1];
            long prev= 1;
            long count = 0;
            for(int j = 1;j<16;j++){
                long current = 4*prev;
                long left = (long)Math.max(start,prev);
                long right = (long)Math.min(current-1,end);
                if(right >= left){
                    count += (right-left+1)*j;
                }
                prev =current;
            }
            res += (count+1)/2;
        }
        return res;
    }
}