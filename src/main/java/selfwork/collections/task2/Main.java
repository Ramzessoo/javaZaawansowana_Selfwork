package selfwork.collections.task2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Author mickiewicz = new Author("Adam", "Mickiewicz", "M");
        Author slowacki = new Author("Julisz", "Słowacki", "M");
        Author orzeszkowa = new Author("Eliza", "Orzeszkowa", "K");
        Author sienkiewicz = new Author("Henryk", "Siekiewicz", "M");

        Book panTadeusz = new Book("Pan Tadeusz, czyli ostatni zajazd na Litwie: " +
                "historia szlachecka z " +
                "roku 1811 i 1812 we" +
                "dwunastu księgach wierszem", 101.17,
                1834, Arrays.asList(mickiewicz), Genre.POEM);
        Book kordian = new Book("Kordian", 54.70,
                1834, Arrays.asList(slowacki), Genre.DRAMA);

        Book nadNiemnem = new Book("Nad Niemnem", 23.99,
                1888, Arrays.asList(orzeszkowa), Genre.ROMANS);
        Book potop = new Book("Potop", 299.99,
                1886, Arrays.asList(sienkiewicz), Genre.ACTION);

        BookService bookService = new BookService();
        bookService.add(panTadeusz);
        bookService.add(kordian);
        bookService.add(potop);
        bookService.add(nadNiemnem);

        System.out.println("Get All: " + bookService.getAll());
        System.out.println("By author - \"Adam Mickiewicz\": " + bookService.findByAuthor(mickiewicz));
        System.out.println("The most expensive: " + bookService.findMostExpensiveBook());
        System.out.println();
        System.out.println("Sorted asc: " + bookService.sortByTitleAsc());
        System.out.println();
        System.out.println("Maps of uniqal Genre and Books: " + bookService.getUniqalPairs());
        System.out.println();
        System.out.println("Stack: " + bookService.bookStack());
        System.out.println("Hashcode: " + bookService.hashCode());
    }
}
