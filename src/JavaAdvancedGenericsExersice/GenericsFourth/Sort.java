package JavaAdvancedGenericsExersice.GenericsFourth;

import java.text.Collator;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Sort <T extends Comparable<T>>{



    public static <T extends Comparable<T>> void sort(CustomList<T> list){

        for (int i = 0; i < list.size(); i++) {
            T current = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                if(current.compareTo(list.get(j))<0){
                    list.swap(i,j);
                }
            }
        }


    }
    }

