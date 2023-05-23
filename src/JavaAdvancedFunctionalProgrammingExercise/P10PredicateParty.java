package JavaAdvancedFunctionalProgrammingExercise;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P10PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> people = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while(!command.equals("Party!")){
            String[] arr = command.split(" ");
            Predicate <String> predicate = filter(arr[1],arr[2]);
            if(arr[0].equals("Double")){
                List<String> peopleToAddAgain = people.stream()
                        .filter(predicate)
                        .collect(Collectors.toList());
                for (String s : peopleToAddAgain) {
                    people.add(s);
                }

            }else {
                people.removeIf(predicate);
            }

            command = scanner.nextLine();
        }
        if(people.isEmpty()){
            System.out.println("Nobody is going to the party!");
        }else {
            Collections.sort(people);
            String result = String.join(", ", people) + " are going to the party!";
            System.out.println(result);
        }
    }

    private static Predicate< String> filter(String whatToDo, String name) {
        if(whatToDo.equals("StartsWith")){
            return s -> s.startsWith(name);
        }
        else if(whatToDo.equals("EndsWith")){
            return s -> s.endsWith(name);
        }
        else if(whatToDo.equals("Length")){
            return s -> s.length()==Integer.parseInt(name);
        }
        else {
            return s ->false;
        }

    }
}
