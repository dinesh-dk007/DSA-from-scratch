class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
       
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            int diff = Math.abs(arr[i]-arr[i+1]);
            if(diff < min){
                min = diff;
                List<Integer> al = new ArrayList<>();
                res.clear();
                al.add(arr[i]);al.add(arr[i+1]);
                res.add(al);
            }else{
                if(diff == min){
                    List<Integer> al = new ArrayList<>();
                    al.add(arr[i]);al.add(arr[i+1]);
                    res.add(al);
                }
            }
        }
        return res;
    }
}