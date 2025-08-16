class Solution {
    public int maximum69Number (int num) {
        String k = ""+num;
        int [] arr = new int [k.length()];
        for(int i = 0;i<k.length();i++){
            arr[i] = k.charAt(i) - '0';
        }
        int ans = 0;
        boolean flag = true;
       for(int i = 0;i<arr.length;i++){
            if(arr[i] == 6 && flag){
                ans = ans*10+9;
                flag = false;
            }else{
                ans = ans*10+arr[i];
            }
        }
        return ans;
    }
}