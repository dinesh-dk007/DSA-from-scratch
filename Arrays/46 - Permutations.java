class Solution {
    public int fact(int n){
        int l = 1;
        for(int i = 1;i<=n;i++)l*=i;
        return l;
    }
    public void reverse(int [] arr,int left,int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public void nextPerm(int [] arr,int n){
        int ind = -1;
        for(int i = n-2;i>=0;i--){
            if(arr[i] < arr[i+1]){
                ind = i;
                break;
            }
        }
        if(ind == -1){
            reverse(arr,0,n-1);
        }else{
        for(int i = n-1;i>ind;i--){
            if(arr[i] > arr[ind]){
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                break;
            }
        }
        reverse(arr,ind+1,n-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        int perm = fact(n);
        System.out.print(perm);
        List<List<Integer>> al = new ArrayList<>();
        al.add(Arrays.stream(nums).boxed().toList());
        for(int i = 1;i<perm;i++){
            nextPerm(nums,n);
            al.add(Arrays.stream(nums).boxed().toList());
        }
        return al;
    }
}