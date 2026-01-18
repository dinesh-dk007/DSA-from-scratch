class Solution {
    public int[] nextSmallerElement(int [] arr,int n){
        Stack<Integer> stk =new Stack<>();
        int [] res  = new int [n];
        for(int i = n-1;i>=0;i--){
            while(!stk.isEmpty() && arr[stk.peek()] > arr[i]){
                stk.pop();
            }
            if(!stk.isEmpty()){
                res[i] = stk.peek();
            }else{
                res[i] = n;
            }
            stk.push(i);
        }
        return res;
    }
    public int[] prevSmallerElement(int [] arr,int n){
        Stack<Integer> stk = new Stack<>();
        int [] res =  new int [n];
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && arr[stk.peek()] >= arr[i]){
                stk.pop();
            }
            if(!stk.isEmpty()){
                res[i] = stk.peek();
            }else{
                res[i] = -1;
            }
            stk.push(i);
        }
        return res;
    }
    public int [] nextGreaterElement(int [] arr,int n){
        Stack<Integer> stk = new Stack<>();
        int [] res = new int [n];
        for(int i = n-1;i>=0;i--){
            while(!stk.isEmpty() && arr[stk.peek()] < arr[i]){
                stk.pop();
            }
            if(!stk.isEmpty()){
                res[i] = stk.peek();
            }else{
                res[i] = n;
            }
            stk.push(i);
        }
        return res;
    }
    public int[] prevGreaterElement(int [] arr,int n){
        Stack<Integer> stk = new Stack<>();
        int res [] = new int [n];
        for(int i = 0;i<n;i++){
            while(!stk.isEmpty() && arr[stk.peek()] <= arr[i]){
                stk.pop();
            }
            if(!stk.isEmpty()){
                res[i] = stk.peek();
            }else{
                res[i] = -1;
            }
            stk.push(i);
        }
        return res;
    }
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        int [] nse = nextSmallerElement(nums,n);
        int [] pse = prevSmallerElement(nums,n);
        int [] nge = nextGreaterElement(nums,n);
        int [] pge = prevGreaterElement(nums,n);
        long max_sum = 0, min_sum = 0;
        for(int i = 0;i<n;i++){
            int min_left = i-pse[i];
            int min_right = nse[i]-i;
            min_sum = min_sum + (min_left*min_right*1L*nums[i]);
            int max_left =  i-pge[i];
            int max_right = nge[i]-i;
            max_sum =  max_sum + (max_left*max_right*1L*nums[i]);
        }
        return max_sum-min_sum;
    }
}