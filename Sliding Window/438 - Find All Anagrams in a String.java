class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        ArrayList<Integer>al = new ArrayList<>();
        int [] arr = new int [26];
        int [] brr = new int [26];
        if(n < m)return al;
        for(char c : p.toCharArray()){
            arr[c-'a']++;
        }
        int left = 0;
        int right = 0;
        while(right < n){
            if(right < m){
                brr[s.charAt(right)-'a']++;
                right++;
            }else{
                brr[s.charAt(left)-'a']--;
                left++;
                brr[s.charAt(right)-'a']++;
                right++;
            }
            if(Arrays.equals(arr,brr))al.add(left);
        }
        return al;
    }
}