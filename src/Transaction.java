/**
 * 
 */


import java.time.LocalDateTime;

/**
 * @author Matthew Stibbins 2/14/2018
 *
 */
public class Transaction {
	
	public static int nextid=0;
	int id;
	Date date;
	int customerID;
	int movieID;
	LendingAgreement lendingAgreement;
	/**
	 * not yet functional transaction setup which when implemented will provide much greater clarity and
	 * effectiveness of system
	 */
	public Transaction(int customerID, LendingAgreement lendingAgreement) {
		this.id = nextid;
		nextid++;
		this.customerID = customerID;
		this.lendingAgreement = lendingAgreement;
		int day = LocalDateTime.now().getDayOfMonth();
		int month = LocalDateTime.now().getMonthValue();
		int year = LocalDateTime.now().getYear();
		date = new Date(month, day, year);
	}
	
	
	// simplified transaction stub until lending agreement setup is functional
	public Transaction(int customerID, int movieID) {
		this.id = nextid;
		nextid++;
		this.customerID = customerID;
		this.movieID = movieID;
		//this.lendingAgreement = lendingAgreement;
		this.lendingAgreement = null;
		int day = LocalDateTime.now().getDayOfMonth();
		int month = LocalDateTime.now().getMonthValue();
		int year = LocalDateTime.now().getYear();
		date = new Date(month, day, year);
	}
	
	public String toString() {
		String out = "ThreadID = " + id + " : ";
		if(lendingAgreement!=null)
			out += "Customer : " + customerID + "\tMovieID = " + movieID + " \n" + this.lendingAgreement.toString() + "\n";
		else
			out += "Customer : " + customerID + "\tMovieID = " + movieID + "\n";
		return out;
	}

}
