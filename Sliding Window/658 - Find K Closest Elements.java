class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(right - left >=  k){
            if(Math.abs(arr[left]-x) > Math.abs(arr[right]-x)){
                left++;
            }else{
                right--;
            }
        }
        List<Integer> al = new ArrayList<>();
        for(int i = left;i<=right;i++)al.add(arr[i]);
        return al;
    }
}