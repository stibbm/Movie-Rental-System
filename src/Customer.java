/**
 * 
 */


import java.util.ArrayList;

/**
 * @author Matthew Stibbins 2/14/2018
 *
 */
public class Customer {

	int customerID;
	String name;
	// every transaction will be tracked in storage and given a unique transaction id number
	// and here we will keep track of the transaction ids this customer took part in
	ArrayList<Integer> transactionHistory = new ArrayList<>();
	/**
	 * 
	 */
	public Customer(String name, int id) {
		this.customerID = id;
		this.name = name;
	}
	
	public void logTransaction(int transactionID) {
		this.transactionHistory.add(transactionID);
	}
	
	public String toString() {
		return name + " , ID: " + this.customerID + "\n";
	}

}
