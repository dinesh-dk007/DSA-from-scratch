class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        String rotate = s+s;
        return rotate.contains(goal);
    }
}