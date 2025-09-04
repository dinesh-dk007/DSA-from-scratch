class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();int m = s2.length();
        if(m < n)return false;
        int [] arr = new int [26];
        int [] brr = new int [26];
        for(char c : s1.toCharArray()){
            arr[c-'a']++;
        }
        int left = 0;
        int right = 0;
        while(right < m){
            if(right < n){
                brr[s2.charAt(right)-'a']++;
                right++;
            }else{
                brr[s2.charAt(left)-'a']--;
                left++;
                brr[s2.charAt(right)-'a']++;
                right++;
            }
            if(Arrays.equals(arr,brr))return true;
        }
        return false;
    }
}