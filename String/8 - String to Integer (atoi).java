class Solution {
    public int myAtoi(String s) {
        long ans = 0;
        boolean neg = false;
        boolean start = false;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == ' ' && !start) continue;
            else if(arr[i] == '-' && !start){
                neg = true;
                start = true;
            }else if(arr[i] == '+' && !start){
                start = true;
            }else{
                int val = arr[i] - '0';
                if (val >= 0 && val <= 9) {
                    ans = ans * 10 + val;
                    if (!neg && ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                    if (neg && -ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
                    start = true;
                }else{
                    break;
                }
            }
        }
        return neg ? (int)-ans :(int)ans;
    }
}
