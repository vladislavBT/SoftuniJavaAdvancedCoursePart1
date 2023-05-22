package JavaAdvancedSetsAndMapsExercise;
import java.util.Scanner;
import java.util.TreeSet;

public class P03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        TreeSet <String> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String []arr = scanner.nextLine().split(" ");
            for (int j = 0; j < arr.length; j++) {
                if(!set.contains(arr[j])){
                    set.add(arr[j]);
                }
            }
        }
        for (String s : set) {
            System.out.print(s + " ");
        }

    }
}
