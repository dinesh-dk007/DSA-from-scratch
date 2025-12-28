class Solution {
    public int binarySearch(int []arr,int left,int right){
        int ans = -1;
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] < 0){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
    public int countNegatives(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for(int i = 0;i<n;i++){
            int [] arr = grid[i];
            int ind = binarySearch(arr,0,m-1);
            if(ind != -1){
                count += m-ind;
            }
        }
        return count;
    }
}