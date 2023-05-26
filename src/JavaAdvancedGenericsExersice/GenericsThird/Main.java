package JavaAdvancedGenericsExersice.GenericsThird;


import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box<Double> box = new Box<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            box.add(Double.parseDouble(scanner.nextLine()));
        }
        Double elementToCompare = Double.parseDouble(scanner.nextLine());
        System.out.println(box.count(elementToCompare));


    }
}
