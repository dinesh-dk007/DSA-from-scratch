class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int alt[] = new int [n+1];
        int max = 0;
        alt[0] = 0;
        for(int i = 1;i<=n;i++){
            alt[i] = gain[i-1]+alt[i-1];
            max = Math.max(max,alt[i]);
        }
        return max;
    }
}