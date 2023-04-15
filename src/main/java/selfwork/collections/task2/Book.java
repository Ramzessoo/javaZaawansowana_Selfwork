package selfwork.collections.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {

    private String title;
    private double prise;
    private int yearOfPublication;
    private List<Author> authorList;
    private Genre genre;

    public Book(String title, double prise, int yearOfPublication, List<Author> authorList, Genre genre) {
        this.title = title;
        this.prise = prise;
        this.yearOfPublication = yearOfPublication;
        this.authorList = authorList;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return prise == book.prise && yearOfPublication == book.yearOfPublication && Objects.equals(title, book.title) && Objects.equals(authorList, book.authorList) && genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, prise, yearOfPublication, authorList, genre);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", prise=" + prise +
                ", yearOfPublication=" + yearOfPublication +
                ", authorList=" + authorList +
                ", genre=" + genre +
                '}';
    }
}
