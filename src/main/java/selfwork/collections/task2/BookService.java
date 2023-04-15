package selfwork.collections.task2;

import java.util.*;
import java.util.function.ToDoubleFunction;

public class BookService {

    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public void remove(Book book) {
        books.add(book);
    }

    public List<Book> getAll() {
        return books;
    }

    public List<Book> findByGenre(Genre genre) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre() == genre) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findPublicatedAfterYear(int yearOfPublication) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getYearOfPublication() < yearOfPublication) {
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> findPublicatedBeforeYear(int yearOfPublication) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getYearOfPublication() >= yearOfPublication) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findPublicatedInYear(int yearOfPublication) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getYearOfPublication() == yearOfPublication) {
                result.add(book);
            }
        }
        return result;
    }

    public Book findMostExpensiveBook() {
        Book result = null;
        for (Book book : books) {
            if (result == null || result.getPrise() < book.getPrise()) {
                result = book;
            }
        }
        return result;
    }

    public Book findCheapestBook() {
        Book result = null;
        for (Book book : books) {
            if (result == null || result.getPrise() > book.getPrise()) {
                result = book;
            }
        }
        return result;
    }

    public List<Book> findByNumberOfAuthors(int numberOfAuthor) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthorList().size() == numberOfAuthor) {
                result.add(book);
            }
        }
        return result;
    }


    public List<Book> sortByTitleAsc() {
        books.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int) o1.getTitle().charAt(0) - (int) o2.getTitle().charAt(0);
            }
        });
        return books;
    }

    public List<Book> sortByTitleDesc() {
        Collections.reverse(books);
        return books;
    }

    public boolean iaBookInRepo(Book book) {
        return books.contains(book);
    }

    public List<Book> findByAuthor(Author author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthorList().contains(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public Map<Genre, String> getUniqalPairs(){
        Map<Genre, String> booksMap = new HashMap<>();
        for (Book book : books){
            booksMap.put(book.getGenre(), book.getTitle());
        }
        return booksMap;
    }

    public Stack<Book> bookStack(){
        books.sort(Comparator.comparingDouble(new ToDoubleFunction<Book>() {
            @Override
            public double applyAsDouble(Book value) {
                return value.getPrise();
            }
        }));
        Stack<Book> bookStack = new Stack<>();
        for (Book book : books){
            bookStack.push(book);
        }
        return bookStack;
    }
}
