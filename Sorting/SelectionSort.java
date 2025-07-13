import java.util.*;
public class SelectionSort {
    public static void selectionSort(int [] arr , int n){
        for(int i = 0;i<n-1;i++){
            int min = i;
            for(int j = i+1;j<n;j++){
                if(arr[j] < arr[i]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
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
        selectionSort(arr,n);
    }

}