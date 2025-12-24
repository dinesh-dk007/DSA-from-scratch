class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total= 0;
        for (int a : apple)total += a;
        Arrays.sort(capacity);
        int used = 0;
        int sum = 0;
        for(int i = capacity.length-1;i >=0;i--){
            sum += capacity[i];
            used++;
            if (sum >= total)return used;
        }
        return used;
    }
}
