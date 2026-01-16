class Solution {
    static final int MOD = 1_000_000_007;
    public int[] nextSmallerElement(int [] arr,int n){
        Stack<Integer> stk = new Stack<>();
        int [] res = new int [n];
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
        int res[] =new int [n];
        for(int i = 0;i<n;i++){
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
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        
        int [] nse = nextSmallerElement(arr,n);
        int [] pse = prevSmallerElement(arr,n);
        long sum = 0;
       // for(int i:pse)System.out.print(i+" ");
        for(int i = 0;i<n;i++){
            int left = i-pse[i];
            int right = nse[i]-i;
            sum = (sum+(left*right*1L*arr[i])%MOD)%MOD;
        }
        return (int)sum;
    }
}