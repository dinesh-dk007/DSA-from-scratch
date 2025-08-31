class Solution {
    public boolean binarySearch(int friends[], int x){
        int left = 0; int right = friends.length-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(friends[mid] == x){
                return true;
            }else if(friends[mid] < x){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return false;
    }
    public int[] recoverOrder(int[] order, int[] friends) {
        Arrays.sort(friends);
        int ans[] = new int [friends.length];
        int ind = 0;
        for(int i : order){
            if(binarySearch(friends,i)){
                ans[ind++] = i;
            }
        }
        return ans;
    }
}