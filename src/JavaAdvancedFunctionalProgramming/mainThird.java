package JavaAdvancedFunctionalProgramming;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class mainThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UnaryOperator <Double> addVat = d -> d*1.20;

        Consumer <Double> print = d -> System.out.printf("%.2f%n",d);

        Arrays.stream(scanner.nextLine().split(", "))
                .map(Double::parseDouble)
                .map(addVat)
                .forEach(print);
    }
}
