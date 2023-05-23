package JavaAdvancedFunctionalProgrammingExercise;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P03CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int []arr =  Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e-> Integer.parseInt(e))
                .toArray();
        Function<int[], Integer> function = (int []a) -> {
            int min =Integer.MAX_VALUE;
            for (int i : a) {
                if(i<min){
                    min=i;
                }
            }
            return min;

        };

        int b = function.apply(arr);

        System.out.println(b);


    }
}
