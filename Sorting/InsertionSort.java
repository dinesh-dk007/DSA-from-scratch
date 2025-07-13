import java.util.*;
public class InsertionSort {
    public static void insertionSort(int [] arr , int n){
        for(int i = 0;i<n;i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
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
        insertionSort(arr,n);
    }

}