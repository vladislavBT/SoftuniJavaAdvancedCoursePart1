package JavaAdvancedSetsAndMapsExercise;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        TreeMap<Character,Integer> map = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            map.putIfAbsent(input.charAt(i), 0);
            if(map.containsKey(input.charAt(i))){
                int currentValue= map.get(input.charAt(i));
                map.put(input.charAt(i),++currentValue);
            }

        }

        for (Map.Entry<Character, Integer> s : map.entrySet()) {
            System.out.println(s.getKey()+ ": " + s.getValue() + " time/s");
        }

    }
}
