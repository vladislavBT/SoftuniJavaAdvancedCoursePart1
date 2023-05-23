package JavaAdvancedIteratorsAndComparatorsExersice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack implements Iterable<Integer>{
   public List<Integer> list = new ArrayList<>();
   public void Push(int[] arr){
       for (int i = 0; i < arr.length; i++) {
           list.add(arr[i]);
       }
   }
   public void Pop(){
       if(!list.isEmpty()){
           this.list.remove(list.size()-1);
       }
       else {
           System.out.println("No elements");
       }
   }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int i=list.size();
            @Override
            public boolean hasNext() {
                return i>0;
            }

            @Override
            public Integer next() {
                i--;
                return list.get(i);
            }
        };
    }
}
