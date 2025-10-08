class Solution {
    public int binarySearch(int []arr,long val,int i){
        int left = 0;
        int right = arr.length-1;
        int ans = -1;
        while(left <= right){
            int mid = (left+right)/2;
            long x = (long)arr[mid]*i;
            if(x >= val){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        Arrays.sort(potions);
        int [] brr = new int [n];
        int k = 0;
        for(int i : spells){
            int ans = binarySearch(potions,success,i);
            //System.out.println(ans);
            int ind  = m-ans;
            if(ans != -1)brr[k++]=ind;
            else brr[k++] = 0;
        }
        return brr;
    }
}