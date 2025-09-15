class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        for(String str : text.split(" ")){
            int flag = 0;
            for(int i = 0;i<brokenLetters.length();i++){
                if(str.indexOf(brokenLetters.charAt(i)) != -1){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)count++;
        }
        return count;
    }
}