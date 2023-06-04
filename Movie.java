public class Movie {
    Movie(String t, String g, int y) {
        this.TITLE = t;
        this.genre = g;
        this.year = y;
        this.actors = new String[5];
        this.rentCount = 0;
        movieCount++;
    }

    Movie(String t, String g) {
        this(t, g, 2020);
    }

    Movie(String t, String g, String a) {
        this(t, g, 2020);
        if (!addActor(a))
            System.out.println("You cannot add more actors.");

    }

    Movie(String t, int y) {
        this(t,"comedy", y);
    }

    public void setGenre(String g) {
        genre = g;
    }

    public void setYear(int y) {
        year = y;
    }

    public boolean addActor(String a) {
        int i;
        for (i = 0; i < actors.length; i++) {
            if (actors[i] == null) {
                actors[i] = a;
                return true;
            }
        }
        return false;
    }

    public void rent() {
        rentCount++;
    }

    public boolean isBlockbuster() {
        return rentCount >= 10000;
    }

    public String getTitle() {
        return this.TITLE;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getYear() {
        return this.year;
    }

    public String[] getActors() {
        return actors;
    }

    public int getRentCount() {
        return rentCount;
    }

    @Override
    public String toString() {
        return TITLE + ", " + year + ", " + genre;
    }

    public boolean equals(Movie thatMovie) {
        return (this.TITLE).equals(thatMovie.TITLE) && (this.genre).equals(thatMovie.genre) && this.year == thatMovie.year;
    }

    public static void decrementMovieCount() {
        movieCount--;
    }

    public int getMovieCount() {
        return movieCount;
    }

    private final String TITLE;
    private String genre;
    private int year;
    private String[] actors;
    private int rentCount;
    private static int movieCount = 0;
}
