import java.util.*;
public class Main {
    public static int secondMax(int [] arr){
        if(arr.length == 1)return arr[0];
        int n = arr.length;
        int max = arr[0];
        int second_max = arr[0];
        for(int i = 1;i<n;i++){
            if(arr[i] > max){
                second_max = max;
                max = arr[i];
            }else if(second_max < arr[i]){
                second_max = arr[i];
            }
        }
        return second_max;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int [n];
        for(int i = 0;i<n;i++)arr[i] = s.nextInt();
        System.out.print(secondMax(arr));
    }
}