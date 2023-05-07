package JavaAdvancedDefineClassExercise.P01OpinionPoll;
import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List <Person> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            String name = line[0];
            int age = Integer.parseInt(line[1]);
            Person person = new Person(name,age);
            if(person.getAge()>30){
                list.add(person);
            }
        }
        list.stream()
                .sorted((p1,p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(person -> System.out.println(person.getName() + " - " + person.getAge()));


    }
}
