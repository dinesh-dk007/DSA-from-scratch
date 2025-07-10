/**
 Question :

You can buy 1 chocolate for $1.Additionally, if you have 3 wrappers, you can exchange them for 1 more chocolate.
 How many chocolates you can buy with as total with the initial money provided ?
 
 Test Case:
 
 Input : 15
 Output : 22
 
 * */

import java.util.*;
public class Main {
    public static int Chocos(int money){
        int count = 0;
        int wrappers = 0;
        int total  = 0;
        if(money != 0) {
            count += money;
            total += count;
        }
        while(wrappers+count >=3){
            wrappers += count;
            count = (int)wrappers/3;
            wrappers = (int) wrappers%3;
            total += count;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int money = s.nextInt();
        System.out.print(Chocos(money));

    }
}