/**
 * 
 */


import java.time.LocalDateTime;

/**
 * @author Matthew Stibbins 2/14/2018
 *
 */
public class LendingAgreement {
	
	// day of lending
	Date dateLent;
	
	// day agreed upon to return by
	Date specifiedReturnDate;
	
	// date actually returned by-- will not store a value until the mov is 
	// returned and this data is being transferred to completed transaction logs
	Date actualReturnDate;
	
	int customerID;
	
	double penaltyRatePerDayOverdue;
	
	/**
	 * 
	 */
	// 
	// have another parameter that specifies the lending agreement which would have like 3 choices of that 
	// we have defined. That choice would give us what the overdue rate is also
	public LendingAgreement(int customerID) {
		// could add a param to track the unique store id of the store that the lending agreement was
		// made at
		this.customerID = customerID;
		int day = LocalDateTime.now().getDayOfMonth();
		int month = LocalDateTime.now().getMonthValue();
		int year = LocalDateTime.now().getYear();
		this.dateLent = new Date(month, day, year);
	}
	
	

}
