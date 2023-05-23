package JavaAdvancedIteratorsAndComparatorsExersice;

import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer>{
    List<Integer> list;
    boolean firstRoundFinished=false;
    public Lake(List<Integer> list) {
        this.list = list;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    public class Frog implements Iterator<Integer>{
      int i= 0;

      @Override
      public boolean hasNext() {
          return i<list.size();
      }

      @Override
      public Integer next() {

          int value =  list.get(i);
          i+=2;
          if(i>=list.size() && !firstRoundFinished){
              i=1;
              firstRoundFinished=true;
          }
          return value;
      }
  }

}

