class Solution {
    public int maximumGain(String s, int x, int y) {
        char a = 'a';
        char b = 'b';
        int n = s.length();
        char [] arr = s.toCharArray();
        if(x < y){
            int temp = x;
            x= y;
            y=temp;
            a='b';
            b='a';
        }
        int aCount = 0, bCount = 0;
        int points = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] == a){
                aCount++;
            }else if(arr[i] == b){
                if(aCount > 0){
                    aCount--;
                    points += x;
                }else{
                    bCount++;
                }
            }else{
                points += Math.min(aCount,bCount)*y;
                aCount = 0;
                bCount = 0;
            }
        }
        if(aCount != 0){
            points += Math.min(aCount,bCount)*y;
            aCount = 0;
            bCount = 0;
        }
        return points;
    }
}