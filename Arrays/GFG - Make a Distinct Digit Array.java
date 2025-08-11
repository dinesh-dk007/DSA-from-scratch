class Solution {
    public int[] common_digits(int[] nums) {
        boolean[] present = new boolean[10];
        int count = 0;

        for (int num : nums) {
            if (num == 0) {
                if (!present[0]) {
                    present[0] = true;
                    count++;
                }
                continue;
            }
            while (num > 0) {
                int digit = num % 10;
                if (!present[digit]) {
                    present[digit] = true;
                    count++;
                }
                num /= 10;
            }
        }

        int[] result = new int[count];
        int idx = 0;
        for (int d = 0; d < 10; d++) {
            if (present[d]) result[idx++] = d;
        }
        return result;
    }
}
