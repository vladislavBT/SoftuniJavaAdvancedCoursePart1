package JavaAdvancedIteratorsAndComparatorsExersice;

import java.util.Comparator;
import java.util.Locale;

public class firstComparator implements Comparator<PersonTwo> {

    @Override
    public int compare(PersonTwo o1, PersonTwo o2) {
        if(o1.name.length()==o2.name.length()){
            char firstChar= o1.name.toLowerCase(Locale.ROOT).charAt(0);
            char secondChar=o2.name.toLowerCase(Locale.ROOT).charAt(0);
            return Character.compare(firstChar,secondChar);
        }
        else{
            return Integer.compare(o1.name.length(),o2.name.length());
        }
    }
}
