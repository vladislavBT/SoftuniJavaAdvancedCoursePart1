package JavaAdvancedFunctionalProgrammingExercise;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P02KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(e -> "Sir "+ e)
                .collect(Collectors.toList());

        list.forEach(s -> System.out.println(s));
    }
}
