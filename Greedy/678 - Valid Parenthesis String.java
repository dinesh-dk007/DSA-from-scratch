class Solution {
    public boolean checkValidString(String s) {
        int low = 0;
        int high =0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                low++;high++;
            }else if(c == ')'){
                if(low > 0)low--;
                high--;
            }else{
                if(low > 0)low--;
                high++;
            }
            if(high < 0)return false;
        }
        return low == 0;
    }
}