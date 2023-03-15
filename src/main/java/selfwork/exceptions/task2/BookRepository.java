package selfwork.exceptions.task2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        this.books.add(book);
    }

    public void delete(String isbn) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                return;
            }
        }
        throw new NoBookFoundException("Can't delete book with isbn " + isbn);
    }

    public List<Book> findByIsbn(String isbn) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {

            }
        }
    }

    public List<Book> findByName(String name) throws NoBookFoundException {
        List<Book> booksByName = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(name)) {
                booksByName.add(book);
            }
        }
        if (booksByName.isEmpty()) {
            throw new NoBookFoundException("Can't fond book with name: " + name);
        }
        return booksByName;
    }
}
