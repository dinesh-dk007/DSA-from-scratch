class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> stk = new Stack<>();
        for(int i : asteroids){
            while(!stk.isEmpty() && (stk.peek() > 0 && i < 0) && stk.peek() < Math.abs(i)){
                stk.pop();
            }
            if(stk.isEmpty())stk.push(i);
            else if( (stk.peek() > 0 && i > 0) || (stk.peek() < 0))stk.push(i);
            else if((stk.peek() > 0 && i < 0) && Math.abs(stk.peek()) == Math.abs(i) ){
                stk.pop();
            }
        }
        int [] res = new int [stk.size()];
        for(int i = stk.size()-1;i>=0;i--){
            res[i] = stk.pop();
        }
        return res;
    }
}