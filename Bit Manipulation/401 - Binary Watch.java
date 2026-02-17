class Solution {
    public int countBits(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n&(n-1);
        }
        return count;
    }
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> res = new ArrayList<>();
        for(int i = 0;i< 12;i++){
            for(int j = 0;j<60;j++){
                int c1 = countBits(i);
                int c2 = countBits(j);
                if(c1 + c2 == turnedOn){
                    StringBuilder sb = new StringBuilder();
                    sb.append(i+":");
                    if(j < 10){
                        sb.append("0");
                    }
                    sb.append(""+j);
                    res.add(sb.toString());
                }
            }
        }
        return res;
    }
}