class Solution {
    public int numOfWays(int n) {
        final int MOD = 1_000_000_007;

        int abc = 6,aba=6;
        for(int i = 2;i<=n;i++){
            int next_aba = (int)((3L *(aba) + 2L *(abc)) % MOD);
            int next_abc = (int)((2L *(aba) + 2L*(abc))% MOD);

            aba = next_aba;
            abc = next_abc;
        }
        return (abc+aba)%MOD;

    }
}