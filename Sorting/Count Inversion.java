class Solution {
    public static int merge(int []arr,int low,int mid,int high){
        int count = 0;
        int i = low;
        int j = mid+1;
        int [] temp = new int [high-low+1];
        int ind = 0;
        while(i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                temp[ind++] = arr[i];
                i++;
            }else{
                temp[ind++] = arr[j];
                count += (mid-i+1);
                j++;
            }
        }
        while(i <= mid){
            temp[ind++] = arr[i++];
        }
        while(j <= high){
            temp[ind++] = arr[j++];
        }
        for(i = low;i <= high;i++){
            arr[i] = temp[i-low];
        }
        return count;
    }
    public static int mergeSort(int [] arr,int low,int high){
        int count = 0;
        if(low >= high)return count;
        int mid = (low+high)/2;
        count += mergeSort(arr,low,mid);
        count += mergeSort(arr,mid+1,high);
        count += merge(arr,low,mid,high);
        return count;
    }
    public long numberOfInversions(int[] nums) {
        int count = mergeSort(nums,0,nums.length-1);
        return count;
    }
}