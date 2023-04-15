package selfwork.classesAndInterfaces.task2;

public class Movie {
    private String title;
    private String director;
    private String genre;
    private String publisher;
    private int year;

    public Movie(String title, String director, String genre, String publisher, int year) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.publisher = publisher;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                '}';
    }

    static class MovieCreator {
        private String title;
        private String director;
        private String genre;
        private String publisher;
        private int year;

        public MovieCreator setTitle(String title) {
            this.title = title;
            return this;
        }

        public MovieCreator setDirector(String director) {
            this.director = director;
            return this;
        }

        public MovieCreator setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public MovieCreator setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public MovieCreator setYear(int year) {
            this.year = year;
            return this;
        }

        public Movie createMovie() {
            Movie movie = new Movie(title, director, genre, publisher, year);
            return movie;
        }
    }
}
