import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int [] arr , int n){
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted Array: ");
        for(int i : arr)System.out.print(i+" ");
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int [n];
        for(int i = 0;i<n;i++){
            arr[i] = s.nextInt();
        }
        bubbleSort(arr,n);
    }

}