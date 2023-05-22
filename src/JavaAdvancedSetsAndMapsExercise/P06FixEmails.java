package JavaAdvancedSetsAndMapsExercise;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\.(us|com|uk)");
        LinkedHashMap <String, String> map = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while(!input.equals("stop")){
            String email = scanner.nextLine();
            Matcher matcher = pattern.matcher(email);
            if (!matcher.find()){
                map.put(input, email);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.printf("%s -> %s%n", s.getKey(),s.getValue());
        }

    }
}
