package JavaAdvancedFunctionalProgramming;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class mainFifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int []arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int lower=arr[0];
        int upper=arr[1];

        String evenOrOdd = scanner.nextLine();

        String line = IntStream.rangeClosed(lower,upper)
                .boxed()
                .filter(filter(evenOrOdd))
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(line);

    }

    private static Predicate<Integer> filter(String evenOrOdd) {
        if(evenOrOdd.equals("even")){
            Predicate <Integer> predicate = i -> i%2==0;
            return predicate;
        }
        else{
            Predicate <Integer> predicate = i -> i%2==1;
            return predicate;
        }

    }



}
