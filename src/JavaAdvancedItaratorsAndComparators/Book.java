package JavaAdvancedItaratorsAndComparators;

import java.util.List;

public class Book implements Comparable<Book>{
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        this.title = title;
        this.year = year;
        this.authors = List.of(authors);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthors(String... authors) {
        this.authors = List.of(authors);
    }

    public void setTitle(String title){
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    @Override
    public int compareTo(Book other) {
        int result = this.getTitle().compareTo(other.getTitle());

        if(result==0){
            result =Integer.compare(this.getYear(),other.getYear());
        }
        return result;
    }
}
