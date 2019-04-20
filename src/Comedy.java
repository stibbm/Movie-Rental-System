/**
 * 
 */


/**
 * @author Matthew Stibbins 2/14/2018
 *
 */
public class Comedy extends Movie{
	
	
	
	private static final String GENRE = "Comedy";
	
	/**
	 * 
	 */
	public Comedy(String label, String director, int stock, int year) {
		super(label, director, GENRE, stock, year);
	}
	
	public String toString() {
		return "" + String.format("%" + SPACING + "s",getLabel()) + " " + String.format("%" + SPACING + "s", getDirector()) + " " + String.format("%" + SPACING + "s", getStock()) + 
				" " + String.format("%" + SPACING + "s",getYear()) + " " + String.format("%" + SPACING + "s",getGenre());
	}

	// get the year of release
	@Override
	public String getDate() {
		return "" + getYear();
	}

	
	// method only exists for compatibility with Classic genre do not use this
	@Override
	public String getMainActor() {
		return "UNDEFINED";
	}

	
	// only for compatibility do not use
	@Override
	public int getMonth() {
		return -1;
	}

}
