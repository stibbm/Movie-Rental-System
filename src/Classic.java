/**
 * 
 */


/**
 * @author Matthew Stibbins 2/14/2018
 *
 */
public class Classic extends Movie{
	
	private static final String GENRE = "Classic";
	
	
	
	public String toString() {
		return "" + String.format("%" + SPACING + "s",getLabel()) + " " + String.format("%" + SPACING + "s", getDirector()) + " " + String.format("%" + SPACING + "s", getStock()) + 
				" " + String.format("%" + SPACING + "s",getYear()) + " " + String.format("%" + SPACING + "s",getGenre());
	}
	
	
	/**
	 * create classic movie object
	 */
	public Classic(String label, String directive, String mainActor,
			int stock, int year, int month) {
		super(label, directive, mainActor, GENRE, stock, year, month);
	}
	
	
	// get date as month + date storage of month specidic to classic
	@Override
	public String getDate() {
		return "" + getMonth() + " " + getYear();
	}

	// get the main actor: storage specific to classic
	@Override
	public String getMainActor() {
		return mainActorHelp();
	}

	// get the month number : storage of month specific to classic
	@Override
	public int getMonth() {
		return monthHelp();
	}

}
