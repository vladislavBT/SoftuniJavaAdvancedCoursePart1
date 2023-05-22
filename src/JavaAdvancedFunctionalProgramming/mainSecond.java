package JavaAdvancedFunctionalProgramming;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class mainSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, String> count = l -> "Count = "+l.size();
        System.out.println(count.apply(list));

        Function<List<Integer>,Integer> sum = l -> l.stream().mapToInt(e -> e).sum();
        Function<Integer, String> formatOutput = s -> "Sum = " + s;

        System.out.println(formatOutput.apply(sum.apply(list)));
    }
}
