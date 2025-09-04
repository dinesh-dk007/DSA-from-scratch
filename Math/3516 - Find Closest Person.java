class Solution {
    public int findClosest(int x, int y, int z) {
        int dis1 = Math.abs(z-x);
        int dis2 = Math.abs(y-z);
        if(dis1 == dis2)return 0;
        return (dis1 < dis2) ? 1 : 2;
    }
}