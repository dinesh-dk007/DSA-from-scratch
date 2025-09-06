/* QUESTION :  Write a function count_heads(N, R) 
that returns the probability of getting 
exactly R heads in N tosses of a fair coin.

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        
        // Calculate nCr
        long nfact = 1;
        for(int i = n; i > (n - r); i--){
            nfact *= i;
        }
        
        long rfact = 1;
        for(int i = r; i > 0; i--){
            rfact *= i;
        }
        
        double nCr = (double) nfact / rfact;
        double probability = nCr / Math.pow(2, n);
        
        System.out.println(probability);
    }
}
