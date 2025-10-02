class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int count = numBottles;
        while(numBottles >= numExchange){
            int exg = numBottles-numExchange;
            int remain = (int)(numBottles-numExchange);
            count += 1;
            numBottles = 1+remain;
            numExchange++;
        }
        return count;
    }
}