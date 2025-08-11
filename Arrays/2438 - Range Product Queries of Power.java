class Solution {
    public int compute(List<Integer> al ,int left,int right){
        long ans = 1;
        if(left == right){
            return al.get(left);
        }
        for(int i =left;i<=right;i++){
            ans = (ans*al.get(i))%1000000007;
        }
        return (int)ans;
    }
    public int[] productQueries(int n, int[][] queries) {
        String binary = Integer.toBinaryString(n);
        List<Integer> powers = new ArrayList<>();
        int p = 1;
        for(int i = binary.length()-1;i>=0;i--){
            if(binary.charAt(i) == '1'){
                powers.add(p);
            }
            p *= 2;
        }
        int [] arr = new int [queries.length];
        for(int i = 0;i<queries.length;i++){
            arr[i] = compute(powers,queries[i][0],queries[i][1]);
        }
        return arr;
    }
}