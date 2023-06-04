import java.util.Arrays;

public class MovieDriver {
    public static void main(String[] args) {
        Movie[] mustWatch = new Movie[5];
        int i, j;

        mustWatch[0] = new Movie("X-Men","thriller",2020);
        mustWatch[1] = new Movie("Pokemon the movie","kids");
        mustWatch[2] = new Movie("Thor","action","Chris Hemsworth");
        mustWatch[3] = new Movie("Frozen 2",2019);

        System.out.println("Number of movies instantiated: " + mustWatch.length);
        for (i = 0; i < mustWatch.length; i++) {
            System.out.println(mustWatch[i].getTitle() + ", " + mustWatch[i].getGenre() + ", " + mustWatch[i].getYear());
        }

        mustWatch[0].setGenre("sci-fi");
        mustWatch[3].setGenre("kids");
        mustWatch[1].setYear(2019);
        mustWatch[2].setYear(2011);

        for (i = 0; i < mustWatch.length; i++) {
            System.out.println(mustWatch[i].getTitle() + ", " + mustWatch[i].getGenre() + ", " + mustWatch[i].getYear());
        }

        mustWatch[2].addActor("Natalie Portman");
        mustWatch[1].addActor("Pikachu");
        mustWatch[1].addActor("Charizard");
        mustWatch[1].addActor("Squirtle");
        mustWatch[1].addActor("Ditto");
        mustWatch[1].addActor("Mewtwo");
        mustWatch[1].addActor("Psyduck");

        System.out.println("The actors of Thor are: " + Arrays.toString(mustWatch[1].getActors()));
        System.out.println("The actors of Pokemon are:" + Arrays.toString(mustWatch[2].getActors()));

        Movie[] myRental = new Movie[3];
        j = 0;
        for (i = 0; i < mustWatch.length; i++) {
            if (mustWatch[i].getGenre().equalsIgnoreCase("kids")) {
                mustWatch[i].rent();
                myRental[j] = mustWatch[i];
                j++;
            }
        }

        System.out.println("Total number of movies instantiated: " + myRental.length);

        for (i = 0; i < mustWatch.length; i++) {
            System.out.println(mustWatch[i].getTitle() + ", " + mustWatch[i].getGenre() + ", " + mustWatch[i].getYear());
        }
        for (i = 0; i < myRental.length; i++) {
            System.out.println(myRental[i].getTitle() + ", " + myRental[i].getGenre() + ", " + myRental[i].getYear());
        }

        myRental[myRental.length - 1] = mustWatch[3];

        System.out.println("Number of times the movie stored in the second element of myRental was rented: " + myRental[1].getRentCount());
        System.out.println("Is it blockbuster? " + myRental[1].isBlockbuster());

        myRental = null;
        mustWatch[0] = null;

        Movie.decrementMovieCount();
    }
}
