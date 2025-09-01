class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        if(numRows == 1)return s;
        StringBuilder sb = new StringBuilder();
        List<Character> arr[] = new List[numRows];
        for(int i = 0;i<numRows;i++){
            arr[i] = new ArrayList<>();
        }
        int p1 = 0;
        int dir = 1;
        int i = 0;
        while(p1 < n){
            arr[i].add(s.charAt(p1++));
            if(i == numRows - 1){
                dir = -1;
            }
            if(i == 0){
                dir = 1;
            }
            i += dir;
        }
        for(List<Character> al : arr){
            for(char c : al)sb.append(c);
        }
        return sb.toString();
    }
}