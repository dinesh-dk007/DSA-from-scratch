class Spreadsheet {
    int [][] sheet;
    public Spreadsheet(int rows) {
        sheet = new int [rows][26];
    }
    
    public void setCell(String cell, int value) {
        int col = cell.charAt(0)-'A';
        int row =  Integer.parseInt(cell.substring(1))-1;
        sheet[row][col] = value;
    }
    
    public void resetCell(String cell) {
        int col = cell.charAt(0)-'A';
        int row = Integer.parseInt(cell.substring(1))-1;
        sheet[row][col] = 0;
    }
    
    public int getValue(String formula) {
        int a = 0;
        int b = 0;
        String sub = formula.substring(1,formula.length());
        String [] str = sub.split("[+]");
        if(Character.isAlphabetic(str[0].charAt(0))){
            int col = str[0].charAt(0)-'A';
            int row =  Integer.parseInt(str[0].substring(1))-1;
            a  = sheet[row][col];
        }
        else{
            a = Integer.parseInt(str[0]);
        }
        if(Character.isAlphabetic(str[1].charAt(0))){
            int col = str[1].charAt(0)-'A';
            int row =  Integer.parseInt(str[1].substring(1))-1;
            b  = sheet[row][col];
        }else{
            b = Integer.parseInt(str[1]);
        }
        return a+b;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */