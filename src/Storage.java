/**
 * 
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author Matthew Stibbins 2/14/2018
 *
 */
public class Storage {
	
	// separate the bintrees into a class that stores the so
	// rtable traits and allows ability to add sortable traits and whatnot
	LinkedList<Movie> list = new LinkedList<Movie>();
	BinTree btreeTitle = new BinTree(1);
	BinTree btreeDirector = new BinTree(2);
	BinTree btreeStock = new BinTree(3);
	BinTree btreeDate = new BinTree(4);
	HashMap<String, Movie> hashMovByName = new HashMap<>();
	HashMap<Integer, Movie> hashMovByID = new HashMap<>();
	TransactionLog tlog = new TransactionLog();
	HashMap<String, HashSet<String>> existsCheck = new HashMap<>();
	
	HashMap<Integer, Customer> hashCustomerByID = new HashMap<>();
	
	
	/**
	 * 
	 */
	public Storage() {
		// TODO Auto-generated constructor stub
	}
	
	// add movies to inventory
	public void addMovie(Movie mov) {
		if(duplicate(mov)) {
			mov.fixNextID();
		}else {
		this.list.add(mov);
		this.btreeTitle.add(mov);
		this.btreeDirector.add(mov);
		this.btreeStock.add(mov);
		this.btreeDate.add(mov);
		this.hashMovByName.put(mov.getLabel(), mov);
		this.hashMovByID.put(mov.getID(), mov);
		if(this.existsCheck.get(mov.getLabel())==null){
			existsCheck.put(mov.getLabel(), new HashSet<>());
			existsCheck.get(mov.getLabel()).add(mov.getDirector());
		}
		}
	}
	
	// checks if the movie is a duplicate
	public boolean duplicate(Movie mov) {
		if(existsCheck.get(mov.getLabel())==null) {
			return false;
		}
		if(existsCheck.get(mov.getLabel()).contains(mov.getDirector()) && (!mov.getGenre().equals("Classic"))) {
			return true;
		}
		return false;
	}
	
	
	// adds customer to our knowledge base
	public void addCustomer(String name, int customerID) {
		Customer customer = new Customer(name, customerID);
		hashCustomerByID.put(customerID, customer);
	}
	
	// print the Title sorted tree
	public void printBtreeTitle() {
		this.btreeTitle.print();
		System.out.println();
	}
	
	
	// print the director name sorted tree
	public void printBtreeDirector() {
		this.btreeDirector.print();
		System.out.println();
	}
	
	
	// print the stock amount sorted tree
	public void printBTreeStock() {
		this.btreeStock.print();
		System.out.println();
	}
	
	// print the date sorted tree
	public void printBTreeDate() {
		this.btreeDate.print();
		System.out.println();
	}
	
	
	// print out the list in chronological order of additions to the list
	public void printList() {
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
	
	
	

}
