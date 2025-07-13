class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i = 0;int n = players.length;
        int j = 0;int m = trainers.length;
        int count  = 0;
        while(i < n && j < m){
            while(j < m && trainers[j] < players[i])j++;
            if(j < m && trainers[j] >= players[i]){
                count++;
                i++;
                j++;
            }
        }
        return count;
    }
}