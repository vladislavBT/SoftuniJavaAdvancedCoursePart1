package JavaAdvancedGenerics.genericsFourth;

import java.util.List;
import java.util.Optional;

public class ListUtils {

    public static <T extends Comparable<T>> T getMax (List<T> list){

        return  list.stream()
                .sorted((a,b)->b.compareTo(a))
                .findFirst()
                .orElseThrow(IllegalAccessError::new);
    }
    public static <T extends Comparable<T>> T getMin (List<T> list){

        return  list.stream()
                .sorted((a,b)->a.compareTo(b))
                .findFirst()
                .orElseThrow(IllegalAccessError::new);
    }


}
