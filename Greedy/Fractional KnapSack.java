class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, long cap) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = val.length;

        for (int i = 0; i < n; i++) {
            map.put(val[i], wt[i]);
        }

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = val[i];

        Arrays.sort(arr, (a, b) -> {
            double unit_a = (double) a / map.get(a);
            double unit_b = (double) b / map.get(b);
            return Double.compare(unit_b, unit_a); 
        });

        double tot = 0;

        for (int v : arr) {
            int weight = map.get(v);

            if (weight > cap) {
                double ratio = (double) v / weight;
                tot += ratio * cap;
                break;
            } else {
                tot += v;
                cap -= weight;
            }
        }

        return tot;
    }
}
