package JavaAdvancedFunctionalProgramming;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mainFourth {
    public static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.age = age;
            this.name = name;
        }
    }

    ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] arr = scanner.nextLine().split(", ");

            Person p = new Person(arr[0], Integer.parseInt(arr[1]));
            people.add(p);

        }
        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        people = condition(people, age, condition);
        print(people, format);
    }

    private static void print(List<Person> people, String format) {
        if (format.equals("name")) {
            Consumer<Person> constructor = p -> System.out.println(p.name);
            people.stream()
                    .forEach(constructor);
        } else if (format.equals("age")) {
            Consumer<Person> constructor = p -> System.out.println(p.age);
            people.stream()
                    .forEach(constructor);
        } else if (format.equals("name age")) {
            Consumer<Person> constructor = p -> System.out.println(p.name + " - " + p.age);
            people.stream()
                    .forEach(constructor);
        }

    }

    private static List<Person> condition(List<Person> people, int age, String condition) {
        if (condition.equals("younger")) {
            return people.stream()
                    .filter(person -> person.age <= age)
                    .collect(Collectors.toList());
        } else if (condition.equals("older")) {
            return people.stream()
                    .filter(person -> person.age >= age)
                    .collect(Collectors.toList());
        }
        else {
            return null;
        }

    }
}



