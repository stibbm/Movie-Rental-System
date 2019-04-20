/**
 * 
 */


import java.util.HashMap;

/**
 * @author Matthew Stibbins 2/14/2018
 *
 */
public class TransactionLog {

	/**
	 * 
	 */
	int size;
	HashMap<Integer, Transaction> transactionHistory = new HashMap<>();
	
	// should write log to file every x amount of time to serve as a backup in case of a system crash
	// could have the delete constructor attempt to write the current data to a file
	public TransactionLog() {
		size=0;
	}
	
	// log the specified transaction
	public void logTransaction(Transaction transaction){
		transactionHistory.put(size, transaction);
		size++;
	}
	
	public String toString() {
		String out = "";
		for(Transaction transaction : this.transactionHistory.values()) {
			out+=transaction;
		}
		return out;
	}

}
