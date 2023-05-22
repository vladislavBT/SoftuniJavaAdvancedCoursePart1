package JavaAdvancedSetsAndMapsExercise;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String []input = scanner.nextLine().split(" ");
        int n =Integer.parseInt(input[0]);
        int m =Integer.parseInt(input[1]);

        LinkedHashSet <Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet <Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            int k=Integer.parseInt(scanner.nextLine());
            firstSet.add(k);
        }
        for (int i = 0; i < m; i++) {
            int k=Integer.parseInt(scanner.nextLine());
            secondSet.add(k);
        }

            LinkedHashSet <Integer> generalSet = firstSet.stream()
                    .filter(two -> secondSet.stream().anyMatch(one -> one.equals(two)))
                    .collect(Collectors.toCollection( LinkedHashSet::new ));

        for (Integer integer : generalSet) {
            System.out.print(integer +" ");
        }

    }
}
