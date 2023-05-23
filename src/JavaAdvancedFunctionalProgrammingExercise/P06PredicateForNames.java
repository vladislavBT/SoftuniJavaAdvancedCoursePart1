package JavaAdvancedFunctionalProgrammingExercise;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P06PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());
        Predicate <String> predicate = s -> {
            if(s.length()<=n){
                return true;
            }
            else return false;
        };
        List <String> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(predicate)
                .collect(Collectors.toList());

        names.forEach(s -> System.out.println(s));
    }
}
