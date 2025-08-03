class Solution {
    public int maxProfit(int[] prices) {
        //My first Intution:
        
        /*int min = 0;
        int i = 0;
        int n = prices.length;
        int total = 0;
        while(i < n-1){
            while(i < n-1 && prices[i] >= prices[i+1])i++;
            min = prices[i];
            while(i < n-1 && prices[i] <= prices[i+1])i++;
            total += prices[i]-min;
        }
        return total;*/
        
        //Best Answer:
        
        int start = prices[0];
        int total = 0;
        for(int i = 1;i<prices.length;i++){
            if(prices[i] > start ) total += prices[i] - start;
            start = prices[i];
        }
        return total;
    }
}