class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count_5 = 0;
        int count_10 = 0;
        for(int i : bills){
            if(i == 5)count_5++;
            else if(i == 10){
                if(count_5 > 0){
                    count_5--;
                    count_10++;
                }else{
                    return false;
                }
            }else{
                if(count_5 > 0 && count_10 > 0){
                    count_5--;
                    count_10--;
                }else if(count_5 > 2){
                    count_5 -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}