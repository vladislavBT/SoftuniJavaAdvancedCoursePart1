package JavaAdvancedGenericsExersice.GenericsSecond;

import java.util.ArrayList;
import java.util.List;

public class Box1 {
    private List<Integer> list;

    public Box1() {
        this.list = new ArrayList<>();
    }

    public void add(int integer){
        list.add(integer);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Integer integer : this.list) {
            String line = String.format("%s: %s%n", integer.getClass().getName(),integer.toString());
            sb.append(line);
        }
return sb.toString();
    }


}
