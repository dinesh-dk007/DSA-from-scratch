class Solution {
    public int minOperations(int[] nums, int k) {
        boolean allEqualK = true;
        for (int num : nums) {
            if (num != k) {
                allEqualK = false;
                break;
            }
        }
        if (allEqualK) return 0;

        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            if (num > k) {
                s.add(num);
            }
        }

        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }

        if (!s.isEmpty() && min >= k) {
            return s.size();
        }

        return -1;
    }
}