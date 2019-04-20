/**
 * 
 */


/**
 * @author Matthew Stibbins 2/14/2018
 *
 */
public class Date {

	final int year;
	final int month;
	final int day;
	
	
	/**
	 * 
	 */
	public Date(int month, int day, int year) {
		this.year = year;
		this.day = day;
		this.month = month;
	}
	
	public String toString() {
		return "" + month + "/" + day + "/" + year;
	}
}
