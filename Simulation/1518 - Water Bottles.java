class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;
        while(numBottles >= numExchange){
            int exg = (int)(numBottles/numExchange);
            int remain = (int)(numBottles%numExchange);
            count += exg;
            numBottles = exg+remain;
        }
        return count;
    }
}