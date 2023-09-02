package Task3.com.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book C", "Author X", 2020));
        books.add(new Book("Book A", "Author Y", 2010));
        books.add(new Book("Book B", "Author Z", 2015));

        Collections.sort(books, (book1, book2) -> Integer.compare(book1.getYear(), book2.getYear()));

        for (Book book : books) {
            System.out.println(book.getTitle() + " (" + book.getYear() + ")");
        }
    }
}
