package MinHeap;
import java.util.*;

public class Main{
    public static void main(String args[]) throws Exception{
        Scanner s = new Scanner(System.in);
        Heap<Integer> heap = new Heap<>();
        heap.insert(10);
        heap.insert(2);
        heap.insert(1);
        heap.insert(100);
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
    }
}