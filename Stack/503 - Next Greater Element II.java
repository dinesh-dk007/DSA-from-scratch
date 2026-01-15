class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stk= new Stack<>();
        int [] res = new int [n];
        for(int i = 2*n-1;i>=0;i--){
            int ind = i%n;
            while(!stk.isEmpty() && stk.peek() <= nums[ind]){
                stk.pop();
            }
            if(ind < n){    
                if(!stk.isEmpty()){
                    res[ind] = stk.peek();
                }else{
                    res[ind] = -1;
                }
            }
            stk.push(nums[ind]);
        }
        return res;
    }
}