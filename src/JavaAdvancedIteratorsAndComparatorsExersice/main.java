package JavaAdvancedIteratorsAndComparatorsExersice;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int n = Integer.parseInt(scanner.nextLine());
        TreeSet<PersonTwo> firstSet = new TreeSet<>(new firstComparator());
        TreeSet<PersonTwo> secondSet = new TreeSet<>(new secondComapator());

        for (int i = 0; i < n; i++) {
            String line= scanner.nextLine();
            String[] arr= line.split(" ");
            PersonTwo person = new PersonTwo(arr[0], Integer.parseInt(arr[1]));
            firstSet.add(person);
            secondSet.add(person);

        }


        firstSet.stream()
                .forEach(e-> System.out.println(e.toString()));
        secondSet.stream()
                .forEach(e-> System.out.println(e.toString()));
    }
}
