class Solution {
    public int GCD(int a,int b){
        if(b == 0)return a;
        return GCD(b,a%b);
    }
    public int LCM(int a,int b,int gcd){
        return (a/gcd)*b;
    }
    public List<Integer> replaceNonCoprimes(int[] nums) {
        int n = nums.length;
        List<Integer> al = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();
        stk.push(nums[0]);
        for(int i = 1;i<n;i++){
            int current = nums[i];
            while(!stk.empty()){
                int top = stk.peek();
                int gcd = GCD(current,top);
                if(gcd > 1){
                    current = LCM(current,top,gcd);
                    stk.pop();
                }else{
                    break;
                }
            }
            stk.push(current);
        }
        al.addAll(stk);
        return al;
    }
}