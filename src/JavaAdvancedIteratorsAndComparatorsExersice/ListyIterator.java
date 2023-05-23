package JavaAdvancedIteratorsAndComparatorsExersice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String>{
   private List<String> list;
   private int index=0;

    public ListyIterator(List<String> list) {
        this.list = list;
    }
    public ListyIterator() {

    }

    public boolean Move(){
        if(index+1<this.list.size()){
            this.index=index+1;
            return true;
        }else{
            return false;
        }

    }
    public boolean HasNext(){
        if((this.list.size()-1)-index>0){
            return true;
        }else {
            return false;
        }
    }
    public String Print(){
        if(list.isEmpty()){
            //throw new Exception("Invalid Operation!");
            return "Invalid Operation!";
        }else{
            return list.get(index);
        }
    }
    public void Create (String... elements){
        this.list=Arrays.asList(elements);
    }


    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            int i=0;
            @Override
            public boolean hasNext() {
                return i<list.size();
            }

            @Override
            public String next() {
                i++;
                return list.get(i);
            }
        };
    }
    public void PrintAll (){
        for (String s : list) {
            System.out.print(s +" ");
        }
        System.out.println();
    }
}
