class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        Thread t1 = new Thread(() -> Arrays.sort(g));
        Thread t2 = new Thread(() -> Arrays.sort(s));
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(Exception e){}
        int count = 0;
        int i = 0;int j = 0;
        while(i < n && j < m){
            if(s[j] >= g[i]){
                i++;
                count++;
            }
            j++;
        }
        return count;
    }
}