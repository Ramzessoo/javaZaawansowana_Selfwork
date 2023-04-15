package selfwork.classesAndInterfaces.task2;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie.MovieCreator()
                .setTitle("The Passion of the Christ")
                .setDirector("Mel Gibson")
                .setGenre("Drama")
                .setPublisher("Nawmarket Films (USA)")
                .setYear(2004)
                .createMovie();
        System.out.println(movie);
    }
}
