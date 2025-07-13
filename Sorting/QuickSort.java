import java.util.*;
public class QuickSort{
    public static int sort(int [] arr , int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j){
            while(i <= high && arr[i] <= pivot)i++;
            while(j >=low && arr[j] > pivot)j--;
            if(i< j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            }
        }
        arr[low]= arr[j];
        arr[j] = pivot;
        return j;
    }
    public static void quickSort(int [] arr , int low , int high){
        if(low < high){
            int pIndex = sort(arr,low,high);
            quickSort(arr,low,pIndex-1);
            quickSort(arr,pIndex+1,high);
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int [n];
        for(int i = 0;i<n;i++)arr[i] = s.nextInt();
        quickSort(arr,0,n-1);
        System.out.print("Sorted Array: ");
        for(int i : arr)System.out.print(i+" ");
    }
}