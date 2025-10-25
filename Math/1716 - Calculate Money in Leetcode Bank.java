class Solution {
    public int totalMoney(int n) {
        int money = 0;
        if(n <= 7){
            money = (n*(1+n))/2;
            return money;
        }
        int a = 1;
        int l = 7;
        int times = (int)n/7;
        int pending = (int)n%7;
        for(int i  = 0;i<times;i++){
            money += (7*(a+l))/2;
            a++;
            l++;
            //System.out.println(money);
        }
        if(pending != 0){
            l = (a+pending)-1;
            money += (pending*(a+l))/2; 
        }
        return money;
    }
}