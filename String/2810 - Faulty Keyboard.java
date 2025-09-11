class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c != 'i')sb.append(c);
            else{
                sb.reverse();
            }
        }
        return sb.toString();
    }
}