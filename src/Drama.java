/**
 * 
 */

/**
 * @author Matthew Stibbins 2/14/2018
 *
 */
public class Drama extends Movie{
	
	
	
	private static final String GENRE = "Drama";
	
	public String toString() {
		return "" + String.format("%" + SPACING + "s",getLabel()) + " " + String.format("%" + SPACING + "s", getDirector()) + " " + String.format("%" + SPACING + "s", getStock()) + 
				" " + String.format("%" + SPACING + "s",getYear()) + " " + String.format("%" + SPACING + "s",getGenre());
	}
	
	
	/**
	 * create drama mov object
	 */
	public Drama(String label, String director, int stock, int year) {
		super(label, director, GENRE, stock, year);
	}

	// get year of release
	@Override
	public String getDate() {
		return "" + getYear();
	}

	// exists for compatibility only. Do not call this method
	@Override
	public String getMainActor() {
		return "UNDEFINED";
	}

	// exists for compatibility only. Do not call this method
	@Override
	public int getMonth() {
		// TODO Auto-generated method stub
		return -1;
	}

}
