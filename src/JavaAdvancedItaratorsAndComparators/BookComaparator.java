package JavaAdvancedItaratorsAndComparators;

import java.util.Comparator;

public class BookComaparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook) {
        return Integer.compare(firstBook.getYear(),secondBook.getYear());
    }
}
