class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        char [] arr = s.toCharArray();
        int res = 0;
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            int val1 = map.get(arr[i]+"");
            if(i+1 < arr.length){
                int val2 = map.get(arr[i+1]+"");
                if(val1 >= val2){
                    sum = val1;
                }
                else{
                    sum = val2-val1;
                    i++;
                }
                res += sum;
            }else{
                res += val1;
            }
        }
        return res;

    }
}