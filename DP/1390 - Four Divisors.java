class Solution {
    public int sumFourDivisors(int[] nums) {
        int total = 0;
        for(int i : nums){
            int count = 0;
            int sum = 0;
            for(int j = 1;j<=(int)Math.sqrt(i);j++){
                if(i%j == 0){
                    count += 1;
                    sum += j;
                    if(j*j != i){
                        count++;
                        sum += i/j;
                    }
                }
                if(count > 4)break;
            }
            if(count == 4){
                total += sum;
            }
        }
        return total;
    }
}