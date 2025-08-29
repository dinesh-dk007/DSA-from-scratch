class Solution {
    public long flowerGame(int n, int m) {
        long path1 = n/2;
        long path2 = (m+1)/2;
        long ans = path1*path2;
        path1 = (n+1)/2;
        path2 = m/2;
        ans += path1*path2;
        return ans;
    }
}