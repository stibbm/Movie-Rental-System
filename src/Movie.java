/**
 * 
 */


/**
 * @author Matthew Stibbins 2/14/2018
 *
 */
public abstract class Movie {
	private static int nextid =0;
	private int id;
	private final String label;
	private final String director;
	private final String mainActor;
	private final String genre;
	
	public static String SPACING = "35";
	
	public boolean lendMov() {
		if(stock<=0) {
			return false;
		}else {
			stock = stock-1;
			lent = lent+1;
			return true;
		}
	}
	
	private int stock;
	private int lent;
	private final int year;
	private final int month;
	
	// hotfix for a failed addition due to duplicate to fix the id numbering
	public void fixNextID() {
		Movie.nextid--;
	}
	
	// in classic should get data as month and year in other 2 should get get as year
	public abstract String getDate();
	
	// get the label/title of the movie
	public String getLabel() {
		return label;
	}
	
	// get the name of the director of the movie
	public String getDirector() {
		return director;
	}
	
	// get the main actor in the movie
	// should always return null unless called from a "Classic" genre movie
	public abstract String getMainActor();
	
	// get the genre of the movie
	public String getGenre() {
		return genre;
	}
	
	// get the amount of mov in stock
	public int getStock() {
		return stock;
	}
	
	// get month only usable for Classic Genre movies. always returns -1 for other genres
	public abstract int getMonth();
	
	// get the year of release
	public int getYear() {
		return year;
	}
	
	// get the mov id
	public int getID() {
		return id;
	}
	
	// return month for classics only
	protected int monthHelp() {
		return month;
	}
	
	// return main actor for classics only
	protected String mainActorHelp() {
		return mainActor;
	}
	
	
	// compare movies based on title
	public int compareByTitle(Movie other) {
		return getLabel().compareTo(other.getLabel());
	}
	
	// compare movies based on director
	public int compareByDirector(Movie other) {
		return getDirector().compareTo(other.getDirector());
	}
	
	// compare movs based on stock available
	public int compareByStock(Movie other) {
		return getStock() - other.getStock();
	}
	
	// compare movs based on dates of release
	public int compareByDate(Movie other) {
		if(!this.getGenre().equals("Classic") && !other.getGenre().equals("Classic")) {
			return Integer.parseInt(getDate()) - Integer.parseInt(other.getDate());
		}
		else {
			return getStock() - other.getStock();
		}
	}
	
	
	
	/**
	 * create a movie object classics call this constructor
	 */
	public Movie(String label, String director, String mainActor, String genre,
			int stock, int year, int month) {
		this.id = nextid;
		nextid++;
		this.label = label;
		this.lent = 0;
		this.director = director;
		this.mainActor = mainActor;
		this.genre = genre;
		this.stock = stock;
		this.year = year;
		this.month = month;
	}
	
	
	/** create a movie object 
	 * Comedies and Dramas call this constructor
	 * @param label
	 * @param director
	 * @param genre
	 * @param stock
	 * @param year
	 */
	public Movie(String label, String director, String genre, int stock, int year) {
		this(label, director, "UNDEFINED", genre, stock, year, -1);
	}
	
	

}
