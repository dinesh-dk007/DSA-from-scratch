class Solution {
    public String reverseWords(String s) {
        s.trim();
        String [] arr = s.split("\\s+");
        StringBuilder sim = new StringBuilder();
        for(int i = arr.length-1;i>=0;i--){
            sim.append(arr[i]);
            sim.append(" ");
        }
        String ans = sim.toString();
        String fin = ans.trim();
        return fin;
    }
}