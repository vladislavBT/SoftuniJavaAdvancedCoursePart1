package JavaAdvancedGenerics.genericsFourth;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers,1,2,3,4,5,6);
        Integer maxValue = ListUtils.getMax(integers);
        Integer minValue = ListUtils.getMin(integers);
        System.out.println(maxValue);
        System.out.println(minValue);
    }
}
