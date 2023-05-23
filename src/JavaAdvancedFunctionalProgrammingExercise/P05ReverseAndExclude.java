package JavaAdvancedFunctionalProgrammingExercise;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P05ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
        int division = Integer.parseInt(scanner.nextLine());
        Predicate <Integer> predicate = n -> n%division!=0;
        list = list.stream()
                .filter(predicate)
                .collect(Collectors.toList());

        Collections.reverse(list);

        list.stream().forEach(n -> System.out.print(n  +" "));



    }
}
