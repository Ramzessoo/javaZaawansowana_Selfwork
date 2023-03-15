package selfwork.exceptions.task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository();
        bookRepository.add(new Book("Harry Potter Part 1", "J.K.Rowlling","3323-434ds"));
        bookRepository.add(new Book("Harry Potter Part 2", "J.K.Rowlling", "534re-dsrt"));
        List<Book> book = bookRepository.findByName("??");
        Book book1 = bookRepository.findByIsbn("??");
        bookRepository.delete("43");
    }
}
