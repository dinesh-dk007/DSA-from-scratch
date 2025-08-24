class Solution {
    public int minimumLength(String s) {
        if(s.length() == 1)return 1;
        int left = 0;
        int right =s.length()-1;
        char arr[] = s.toCharArray();
        while(left < right && arr[left] == arr[right]){
            //if(left == right)return 1;
            char temp = arr[left];
            while(left <= right && arr[left] == temp)left++;
            while(left <= right && arr[right] == temp)right--;
        }
        return right-left+1;
    }
}