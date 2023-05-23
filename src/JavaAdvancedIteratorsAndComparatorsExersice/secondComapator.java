package JavaAdvancedIteratorsAndComparatorsExersice;

import java.util.Comparator;

public class secondComapator implements Comparator<PersonTwo> {

    @Override
    public int compare(PersonTwo o1, PersonTwo o2) {
        return Integer.compare(o1.age,o2.age);
    }
}
