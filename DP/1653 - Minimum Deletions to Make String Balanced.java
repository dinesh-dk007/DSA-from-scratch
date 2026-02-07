class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int count_a[]  = new int [n];
        int aCount = 0;
        for(int i = n-1;i>=0;i--){
            count_a[i] = aCount;
            if(s.charAt(i) == 'a')aCount++;
        }
        int res = Integer.MAX_VALUE;
        int bCount = 0;
        for(int i = 0;i<n;i++){
            int delete = bCount+count_a[i];
            res= Math.min(res,delete);
            if(s.charAt(i) == 'b')bCount++;
        }
        return res;
    }
}