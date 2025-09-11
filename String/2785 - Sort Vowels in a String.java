class Solution {
    public String sortVowels(String s) {

        StringBuilder sb = new StringBuilder();
        char [] ch = s.toCharArray();
        String store = "aeiouAEIOU";
        for(char c : ch){
            if(store.contains(String.valueOf(c))){
                sb.append(c);
            }
        }
        char[] aftersb = sb.toString().toCharArray();
        Arrays.sort(aftersb);
        int ind =0;
        for(int i=0;i<ch.length;i++){
            if(store.contains(String.valueOf(ch[i]))){
                ch[i] = aftersb[ind++];
            }
        }
        return new String(ch);
    }
}