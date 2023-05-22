package JavaAdvancedFunctionalProgramming;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class mainFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(integer -> integer%2==0)
                .collect(Collectors.toList());

        for (Integer integer : list) {
            System.out.print(integer+", ");

        }

        System.out.println();
        List<Integer> sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList());

        for (Integer integer : sortedList) {
            System.out.print(integer+", ");

        }
    }
}
