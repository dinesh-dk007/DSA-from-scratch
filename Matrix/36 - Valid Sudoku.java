class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> rows[] = new HashSet[9];
        HashSet<Character> cols[] = new HashSet[9];
        HashSet<Character> boxes[] = new HashSet[9];
        for(int i = 0;i<9;i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                char cp = board[i][j];
                if(cp == '.')continue;
                int boxId = (i/3)*3 + (j/3);
                if(rows[i].contains(cp) || cols[j].contains(cp) || boxes[boxId].contains(cp))return false;
                rows[i].add(cp);
                cols[j].add(cp);
                boxes[boxId].add(cp);
            }
        }
        return true;

    }
}