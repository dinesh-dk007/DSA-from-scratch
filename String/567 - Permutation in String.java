class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] arr = new int [26];
        int n = s1.length();
        int m = s2.length();
        for(int i = 0;i<n;i++){
            arr[s1.charAt(i)-'a']++;
        }
        int [] brr = new int [26];
        int right = 0,left = 0;
        while(right < m){
            if(right >= n){
                brr[s2.charAt(left)-'a']--;
                left++;
            }
            brr[s2.charAt(right)-'a']++;
            if(Arrays.equals(arr,brr))return true;
            right++;
        }
        return false;
    }
}