package JavaAdvancedGenericsExersice.GenericsFourth;

import java.security.cert.CRLReason;
import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable<T>> {


    private List <T> list;

    public CustomList(List <T> list) {
        this.list = list;
    }



    public void add(T element){
        this.list.add(element);
    }
    public T remove(int index){
        return this.list.remove(index);
    }
    public boolean contains(T element){
        return list.contains(element);
    }
    public void swap(int firstIndex , int secondIndex){
        T swapper1;
        T swapper2;
        swapper1=list.get(firstIndex);
        swapper2=list.get(secondIndex);
        list.set(firstIndex,swapper2);
        list.set(secondIndex,swapper1);
    }
    public int countGreaterThan(T element){
        int count=0;

        for (T t : this.list) {
            if(t.compareTo(element)>0){
                count++;
            }
        }

        return count;
    }
    public T getMax(){
        T maxElement= list.get(0);
        for (T t : list) {
            if(t.compareTo(maxElement)>0){
                maxElement=t;
            }
        }
        return maxElement;
    }
    public T getMin(){
        T minElement= list.get(0);
        for (T t : list) {
            if(t.compareTo(minElement)<0){
                minElement=t;
            }
        }
        return minElement;
    }
    public void print(){
        for (T t : list) {
            System.out.println(t);
        }

    }
    public int size(){
        return list.size();
    }

    public T get(int index){
        return list.get(index);
    }


}
