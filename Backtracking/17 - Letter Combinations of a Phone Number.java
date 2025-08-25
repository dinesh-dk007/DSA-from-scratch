class Solution {
    public void backtrack(int ind,String num,List<String> al,Map<Character,char[]> map,StringBuilder sb){
        if(sb.length() == num.length()){
            al.add(sb.toString());
            return;
        }
        char [] arr = map.get(num.charAt(ind));
        for(char c : arr){
            sb.append(c);
            backtrack(ind+1,num,al,map,sb);
            sb.deleteCharAt(sb.length()-1);
        }

    }
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length() == 0 || digits == null){
            //res.add("");
            return res;
        }
        Map<Character,char[]> map =new HashMap<>();
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[]{'d', 'e', 'f'});
        map.put('4', new char[]{'g', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});
        map.put('7', new char[]{'p', 'q', 'r', 's'}); 
        map.put('8', new char[]{'t', 'u', 'v'});
        map.put('9', new char[]{'w', 'x', 'y', 'z'});
        StringBuilder sb = new StringBuilder();
        backtrack(0,digits,res,map,sb);
        return res;
    }
}