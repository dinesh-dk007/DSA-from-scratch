package MinHeap;
import java.util.*;

public class Heap <T extends Comparable<T>>{
    ArrayList<T> al = new ArrayList<>();
    

    private int getParent(int index){
        return (index-1)/2;
    }
    private int getLeft(int index){
        return index*2+1;
    }
    private int getRight(int index){
        return index*2 + 2;
    }
    private void swap(int first,int second){
        T temp = al.get(first);
        al.set(first,al.get(second));
        al.set(second,temp);
        return;
    }

    public void upHeap(int index){
        if(index == 0) return;

        int parent = getParent(index);

        if(al.get(parent).compareTo(al.get(index)) > 0){
            swap(parent,index);
            upHeap(parent);
        }
    }   

    public void insert(T value){
        al.add(value);
        upHeap((al.size()-1));
    }


    public void downHeap(int index){
        int min = index;
        int left = getLeft(index);
        int right = getRight(index);
        if(left < al.size() && al.get(left).compareTo(al.get(min)) < 0){
            min = left;
        }
        if(right < al.size() && al.get(right).compareTo(al.get(min)) < 0){
            min = right;
        }
        if(min != index){
            swap(index,min);
            downHeap(min);
        }

    }
    public T remove() throws Exception{
        if(al.isEmpty())
            throw new Exception("Heap is empty");
        T top = al.get(0);
        if(al.size() == 1){
            al.remove(0);
            return top;
        }
        T val = al.remove(al.size()-1);
        al.set(0,val);
        downHeap(0);
        return top;
    }

}
