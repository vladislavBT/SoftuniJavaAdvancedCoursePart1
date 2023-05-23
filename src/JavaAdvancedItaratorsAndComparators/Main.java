package JavaAdvancedItaratorsAndComparators;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        List<Book> books= new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);
//        if (bookOne.compareTo(bookTwo) > 0) {
//            System.out.println(String.format("%s is before %s", bookOne, bookTwo));
//        } else if (bookOne.compareTo(bookTwo) < 0) {
//            System.out.println(String.format("%s is before %s", bookTwo, bookOne));
//        } else {
//            System.out.println("Book are equal");
//        }

        books.stream()
                .sorted(new BookComaparator())
                .forEach(e -> System.out.println(e));
    }
}
