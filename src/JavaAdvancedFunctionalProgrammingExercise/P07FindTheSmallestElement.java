package JavaAdvancedFunctionalProgrammingExercise;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P07FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list =Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
        Function<List<Integer>, Integer> function = l -> {
            int min =Integer.MAX_VALUE;
            int index =-1;
            for (int i = 0; i < l.size(); i++) {
                if(l.get(i)<=min){
                    index = i;
                    min=l.get(i);
                }
            }
            return index;
        };

        System.out.println(function.apply(list));
    }
}
