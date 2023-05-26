package JavaAdvancedGenericsExersice.GenericsThird;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Box<T extends Comparable<T>> {
   private List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void add(T element){
       this.list.add(element);
   }

   public void swap(int indexFirst, int indexSecond){
        T swapper1;
        T swapper2;
        swapper1=list.get(indexFirst);
       swapper2=list.get(indexSecond);
        list.set(indexFirst,swapper2);
       list.set(indexSecond,swapper1);
   }

    public List<T> getList() {
        return this.list;
    }
    public int count(T element){
        int count=0;

        for (T t : this.list) {
            if(t.compareTo(element)>0){
                count++;
            }
        }

        return count;
    }
}
