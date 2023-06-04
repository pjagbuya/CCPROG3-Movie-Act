/** The class Movie represents a movie
  * available and listed from iTunes
  *
  * @author Paul Josef P. Agbuya
  * @author Vince Kenneth D. Rojo
  * @author Acemere F. Villena
  * @version 1.0
  */
public class Movie {

    
    /**
     * This constructor intitializes the title, genre, and the year
     * the movie was made in the iTunes platform based on the parameters
     * given. It also checks if the genre provided is valid to be set as 
     * an attribute else continue the default movie genre as comedy. It would
     * then check if the year is validly at least 1900 to set or else will 
     * set default as 2020. Furthermore, initializes an array of actors 
     * which can only contain a maximum of 5 Strings. Lastly, sets default
     * value of rentCount to 0 and increments the movieCount
     * 
     * @param title the title of the movie
     * @param genre the classfied genre of the movie
     * @param year the year the movie was released
     */
    Movie(String title, String genre, int year) {
        this.TITLE = title;
        this.genre = "comedy";
        this.year = year;
        this.actors = new String[5];
        this.rentCount = 0;
        movieCount++;

        if(validateGenre(genre)){
            this.genre = genre;
        }

        if(year >= 1900){
            this.year = year;
        }
        else{
            this.year = 2020;
        }


    }

    /**
     * This constructor intitializes the title and genre of the
     * movie created in the iTunes platform based on the parameters
     * given. It also checks if the genre provided is valid to be set as 
     * an attribute else continue the default movie genre as comedy. 
     * Furthermore, initializes an array of actors which can only 
     * contain a maximum of 5 Strings. Lastly, sets default value of rentCount
     * to 0, default value of year to 2020, and increments the movieCount
     * 
     * @param title the title of the movie
     * @param genre the classfied genre of the movie
     */
    Movie(String title, String genre) {
        this(title, genre, 2020);
    }


    /**
     * This constructor intitializes the title, genre, and one actor in the
     * movie created in the iTunes platform based on the parameters
     * given. It also checks if the genre provided is valid to be set as 
     * an attribute or else continue the default movie genre as comedy. 
     * Furthermore, initializes an array of actors which can only contain a maximum of
     * 5 Strings. The parameter actor should be filling the first slot of 
     * this array. Lastly, sets default value of rentCount to 0, default 
     * value of year to 2020, and increments the movieCount
     * 
     * @param title the title of the movie
     * @param genre the classfied genre of the movie
     * @param actor the actor that is within the movie
     */
    Movie(String title, String genre, String actor) {
        this(title, genre, 2020);
        addActor(actor);

    }

    /**
     * This constructor intitializes the title and year that the
     * movie created in the iTunes platform based on the parameters
     * given. It also sets the default genre of the movie as comedy. 
     * It would then check if the year is validly at least 1900 to set 
     * or else will set default as 2020. Furthermore, initializes an 
     * array of actors which can only contain a maximum of 5 Strings. 
     * Lastly, sets default value of rentCount to 0 and increments 
     * the movieCount.
     * 
     * @param title the title of the movie
     * @param year the year the movie was released
     */
    Movie(String title, int year) {
        this(title,"comedy", year);
    }


    /**
     * This method sets the genre based on the parameters given. It would first
     * check if it is valid to be set as genre or else does not change the original
     * genre attribute.
     * 
     * @param genre the classfied genre of the movie
     */
    public void setGenre(String genre) {

        if(validateGenre(genre))
            this.genre = genre;

    }


    /**
     * This method sets the year of the movie based on the parameter given. But it
     * would first check if it is at least from 1900 or else it will not change and retain
     * the original value of the year
     * 
     * @param year the year the movie was released
     */
    public void setYear(int year) {
        if (year >= 1900){
            this.year = year;
        }
        
    }


    /**
     * This method checks if the parameter can be added to the String
     * array, if so it would add it in the array. When the array is full
     * it would then return false, signifying the parameter cannot be added
     * 
     * @param actor the actor that is within the movie
     * @return true if actor can be added to the array, else when the array is full
     *         this method will return false
     */
    public boolean addActor(String actor) {
        int i;
        for (i = 0; i < actors.length; i++) {
            if (actors[i] == null) {
                actors[i] = actor;
                return true;
            }
        }
        return false;
    }


    /**
     * This method checks if the parameter can be allowed as an attribute of genre from
     * the set list of genres.
     * 
     * @param genre the classfied genre of the movie
     * @return true if genre is part of the list of genres, else when it is not then
     *         this method will return false
     */  
    public boolean validateGenre (String genre) {
        int i;
        String[] genres = new String[]{"drama", "horror", "comedy", "biography",
            "sci-fi", "action","romance", "kids"};

        for (i = 0; i < genres.length; i++){

            if(genre.equalsIgnoreCase(genres[i])){

                return true;
            }
        }

        return false;

    }


    /**
     * This method increments movieCount to count the number of
     * created movies
     */
    public void rent() {
        rentCount++;
    }

    /**
     * This method checks if the rentCount of the movie is at least
     * the value of 10 000
     * 
     * @return true if the rentCount is greater than or equal to 10000,
     *         else will return false when less than 10000
     */
    public boolean isBlockbuster() {
        return rentCount >= 10000;
    }


    /**
     * This method returns the title of the movie
     * 
     * @return the String indicating the title of the movie
     */
    public String getTitle() {
        return this.TITLE;
    }


    /**
     * This method returns the genre the movie is classified as.
     * 
     * @return the String indicating the genre classification of the movie.
     */
    public String getGenre() {
        return this.genre;
    }


    /**
     * This method returns the year the movie was released
     * 
     * @return the number that indicates the year of the movie was released
     */
    public int getYear() {
        return this.year;
    }


    /**
     * This method returns the list of actors in a manner of a String array
     * 
     * @return String array indicating the actors of a movie
     */
    public String[] getActors() {
        return actors;
    }


    /**
     * This method returns the amount of times the movie was rented
     * 
     * @return the number of times the movie was rented
     */
    public int getRentCount() {
        return rentCount;
    }


    /**
     * This method returns the number of times a movie was created by this class
     * 
     * @return the number of times a movie was created by this class
     */
    public static int getMovieCount() {
        return movieCount;
    }


    /**
     * This method returns the concatentation of the movie's title, year, and genre
     * 
     * For Example: Frozen, 2013, kids
     * 
     * @return concatentation of the movie's title, year, and genre
     */
    @Override
    public String toString() {
        return TITLE + ", " + year + ", " + genre;
    }


    /**
     * This method checks the parameter if it is identically being compared to itself
     * or the parameter's title, genre, and year released are identical to this current
     * instance of Movie. It returns false if not identical, else it will return true.
     * 
     * @param thatMovie is another Movie object that is compared to this current instance of a Movie class
     * @return true if the parameter is identical or the title, genre, and year is the same. This would
     *         otherwise return false if thatMovie was null or at least one of parameter's attribute formerly
     *         mentioned is not equal to this current instance's
     */
    public boolean equals(Movie thatMovie) {

        if (this == thatMovie){
            return true;
        }

        // First checks if the parameter is null and then compare title, genre, and year
        return thatMovie != null && ((this.TITLE).equalsIgnoreCase(thatMovie.TITLE) && 
               (this.genre).equalsIgnoreCase(thatMovie.genre) && 
               this.year == thatMovie.year);
    }

    /**
     * This method decreases only the movieCount or the attribute indicating the number 
     * of movies currently available
     */
    public static void decrementMovieCount() {
        movieCount--;
    }


    /** Title of the movie */
    private final String TITLE;
    /**Genre that the movie is classfied as */
    private String genre;
    /**Year the movie is released */
    private int year;
     /**Actors/actresses' name listed under the movie */
    private String[] actors;
    /**Number of rent this movie currently has */
    private int rentCount;
    /**Total amount of Movie objects made and available currently*/
    private static int movieCount;

}
