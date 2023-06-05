import java.util.Arrays;
/**
 * Class MovieDriver is a driver class that is used
 * to create instances of the Movie Class in simulating
 * its use in creating Movies in the iTunes
 * 
 * @author Paul Josef P. Agbuya
 * @author Vince Kenneth D. Rojo
 * @author Acemere F. Villena
 * @version 1.0
 */
public class MovieDriver {
    public static void main(String[] args) {

        // Declare and instantiate an array of 5 Movie objects called mustWatch
        Movie[] mustWatch = new Movie[5];
        int i, j;

        /* Instantiate the first Movie object using the following information:
           title = X-Men , genre = thriller, year = 2000 */
        mustWatch[0] = new Movie("X-Men","thriller",2020);

        /* Instantiate the second Movie object using the following information:
           title = Pokemon the movie , genre = kids*/
        mustWatch[1] = new Movie("Pokemon the movie","kids");

        /* Instantiate the third Movie object using the following information:
           title = Thor , genre = action , actor = Chris Hemsworth*/
        mustWatch[2] = new Movie("Thor","action","Chris Hemsworth");

        /* Instantiate the fourth Movie object using the following information:
           title = Frozen 2 , year = 2019*/
        mustWatch[3] = new Movie("Frozen 2",2019);

        // Display the total number of movies instantiated
        System.out.println("Number of movies instantiated: " + Movie.getMovieCount());

        // Display the title, genre, and year of all movies in mustWatch
        for (i = 0; i < mustWatch.length; i++) {
            if (mustWatch[i] != null)
                System.out.println(mustWatch[i].getTitle() + ", " + mustWatch[i].getGenre() + ", " + mustWatch[i].getYear());
        }

        // Modify genre of first movie in mustWatch to sci-f
        mustWatch[0].setGenre("sci-fi");

        // Modify genre of 4th movie in mustWatch to kids
        mustWatch[3].setGenre("kids");

        // Modify year released of second movie in mustWatch to 2019
        mustWatch[1].setYear(2019);

        // Modify year released of third movie in mustWatch to 2011
        mustWatch[2].setYear(2011);


        // Display the title, genre, and year of all movies in mustWatch
        for (i = 0; i < mustWatch.length; i++) {
            if (mustWatch[i] != null)
                System.out.println(mustWatch[i].getTitle() + ", " + mustWatch[i].getGenre() + ", " + mustWatch[i].getYear());
        }

        // Add Natalie Portman as another actor to the third movie stored in mustWatch
        mustWatch[2].addActor("Natalie Portman");

        /* Add the following actors (in sequence) to the second movie stored in mustWatch:
           Pikachu, Charizard, Squirtle, Ditto, Mewtwo, Psyduck */
        mustWatch[1].addActor("Pikachu");
        mustWatch[1].addActor("Charizard");
        mustWatch[1].addActor("Squirtle");
        mustWatch[1].addActor("Ditto");
        mustWatch[1].addActor("Mewtwo");
        mustWatch[1].addActor("Psyduck");

        // Display all actors of the third movie stored in mustWatch
        System.out.println("The actors of Pokemon are:" + Arrays.toString(mustWatch[2].getActors()));

        // Display all actors of the second movie stored in mustWatch
        System.out.println("The actors of Thor are: " + Arrays.toString(mustWatch[1].getActors()));
        
        // Declare and instantiate another array of at most 3 movies called myRenta
        Movie[] myRental = new Movie[3];

        /* Rent all movies that are in the genre of kids from mustWatch. These movies should now be 
           associated also to myRental */
        j = 0;
        for (i = 0; i < mustWatch.length; i++) {
            if (mustWatch[i] != null && mustWatch[i].getGenre().equalsIgnoreCase("kids")) {
                mustWatch[i].rent();
                myRental[j] = mustWatch[i];
                j++;
            }
        }

        // Display the total number of movies instantiated
        System.out.println("Total number of movies instantiated: " + Movie.getMovieCount());

        //  Display the title, genre, and year of all movies in mustWatch 
        for (i = 0; i < mustWatch.length; i++) {
            if (mustWatch[i] != null)
                System.out.println(mustWatch[i].getTitle() + ", " + mustWatch[i].getGenre() + ", " + mustWatch[i].getYear());
        }

        // Display the title, genre, and year of all movies in myRental
        for (i = 0; i < myRental.length; i++) {
            if (myRental[i] != null)
                System.out.println(myRental[i].getTitle() + ", " + myRental[i].getGenre() + ", " + myRental[i].getYear());
        }

        // Rent the movie Frozen 2 again and store that as the last element to myRental
        myRental[myRental.length - 1] = mustWatch[3];

        /* Display the number of times the movie stored in the second element of myRental was rented
           and display the result of isBlockBuster() for that movie */
        System.out.println("Number of times the movie stored in the second element of myRental was rented: " + myRental[1].getRentCount());
        System.out.println("Is it blockbuster? " + myRental[1].isBlockbuster());

        // Set myRental to null
        myRental = null;

        // Delete the movie object with title X-Men
        mustWatch[0] = null;

        // Update the total number of movies instantiated. Display the total number of movies instantiated
        Movie.decrementMovieCount();
        System.out.println("Total number of movies instantiated: " + Movie.getMovieCount());

        // Clean up
        mustWatch = null;

    }
}
