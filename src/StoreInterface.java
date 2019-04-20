/**
 * 
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Matthew Stibbins 2/14/2018
 *
 */
public class StoreInterface {
	
	Storage storeData = new Storage();
	
	// print all customers data
	public void printCustomers() {
		for(Customer c : storeData.hashCustomerByID.values()) {
			System.out.println(c);
		}
	}
	
	// print all tree sorts
	public void print() {
		storeData.printBtreeTitle();
		System.out.println();
		storeData.printBtreeDirector();
		System.out.println();
		storeData.printBTreeStock();
		System.out.println();
	}
	
	/**
	 * load customer data from file
	 * @param filename
	 * @throws IOException
	 */
	public void loadCustomerData(String filename) throws IOException {
		File invFile = new File(filename);
		FileReader fr = new FileReader(invFile);
		BufferedReader br = new BufferedReader(fr);
		String line=null;
		while((line=br.readLine())!=null) {
			if(line.length() > 4) {
				Scanner s = new Scanner(line);
				int id = s.nextInt();
				String name = s.next() + s.next();
				storeData.addCustomer(name, id);
			}
			
		}
	}
	
	void printList() {
		storeData.printList();
	}
	
	/**
	 * Load customer and store inventory data from file
	 * @throws IOException 
	 * 
	 */
	public StoreInterface(String invFile, String customerFile) throws IOException {
		loadCustomerData(customerFile);
		loadStoreInventory(invFile);
	}
	
	/** 
	 * allow the stated transaction to occur
	 * @param customerID
	 * @param movID
	 */
	public void allowTransaction(int customerID, int movID) {
		Transaction transaction = new Transaction(customerID, movID);
		boolean lendSuccessful = storeData.hashMovByID.get(movID).lendMov();
		if(lendSuccessful) {
			storeData.tlog.logTransaction(transaction);
			storeData.hashCustomerByID.get(customerID).logTransaction(transaction.id);
		}
	}
	
	/**
	 * load in a file with inventory data
	 * @param filename
	 * @throws IOException
	 */
	public void loadStoreInventory(String filename) throws IOException {
		// read in an inventory file and load into memory
		File invFile = new File(filename);
		FileReader fr = new FileReader(invFile);
		BufferedReader br = new BufferedReader(fr);
		String line=null;
		
		while((line = br.readLine())!=null) {
			String[] tokens = line.split(",");
			String movFlag = tokens[0];
			int stock = Integer.parseInt(tokens[1].trim());
			if(movFlag.equals("F") || movFlag.equals("D")) {
				// flag, stock, director , name of movie, date
				String director = tokens[2];
				String label = tokens[3];
				int year = Integer.parseInt(tokens[4].trim());
				if(movFlag.equals("F")) {
					storeData.addMovie(new Comedy(label, director, stock, year));
				}
				else if(movFlag.equals("D")) {
					storeData.addMovie(new Drama(label, director, stock, year));
				}
				
			}
			// is in the "Classic" format then
			else if(movFlag.equals("C")) {
				String director = tokens[2];
				String label = tokens[3];
				Scanner s = new Scanner(tokens[4]);
				String actor = s.next() + " " + s.next();
				int month = s.nextInt();
				int year = s.nextInt();
				s.close();
				storeData.addMovie(new Classic(label, director, actor, stock, year, month));
			}
		}
	}

}
