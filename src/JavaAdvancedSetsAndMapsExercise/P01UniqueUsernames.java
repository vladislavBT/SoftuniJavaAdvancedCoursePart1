package JavaAdvancedSetsAndMapsExercise;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class P01UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashSet <String> set = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            if(!set.contains(input)){
                set.add(input);
            }
        }

        set.forEach(s -> System.out.println(s));


    }
}
