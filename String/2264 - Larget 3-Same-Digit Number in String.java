class Solution {
    public String largestGoodInteger(String num) {
        String [] arr = {"000","111","222","333","444","555","666","777","888","999"};
        int ans = -1;
        int index = Integer.MAX_VALUE;
        for(int i = 0;i<10;i++){
            int k = num.indexOf(arr[i]);
            if(k != -1 && i > ans){
                ans = i;
            }
        }
        if(ans == -1){
            return "";
        }else{
            return arr[ans];
        }
    }
}