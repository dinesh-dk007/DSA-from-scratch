class Solution {
    public int[] previousSmallerElement(int [] arr,int n){
        int [] res = new int [n];
        Stack<Integer> stk =  new Stack<>();
        for(int i = 0;i<n;i++){
            while(!stk.isEmpty() && arr[stk.peek()] > arr[i]){
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
    public int[] nextSmallerElement(int [] arr,int n){
        int [] res = new int [n];
        Stack<Integer> stk = new Stack<>();
        for(int i = n-1;i>=0;i--){
            while(!stk.isEmpty() && arr[stk.peek()] >= arr[i]){
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
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int [] pse = previousSmallerElement(heights,n);
        int [] nse = nextSmallerElement(heights,n);
        int max  = 0;
        for(int i = 0;i<n;i++){
            int left = i-pse[i];
            int right = nse[i]-i;
            max = Math.max(max,(left+right-1)*heights[i]);
        }
        return max;
    }
}