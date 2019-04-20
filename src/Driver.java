/**
 * 
 */

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Matthew Stibbins 2/14/2018
 *
 */
public class Driver {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		StoreInterface si = new StoreInterface("data.txt", "customerData.txt");
		/*Random r = new Random();
		String tOut="";
		int n1=-1;
		int n2 =-1;
		for(int i=0;i<100000;i++) {
			System.out.println(i);
			for(int x=0;x<100;x++) {
				
				int ch = r.nextInt(26);
				if(x%3==0) {
					n1 = ch; 
				}
				if(x%3==1) {
					n2 = ch;
				}
				char rand = (char)((97-ch));
				tOut = tOut + "" + rand;
			}
			int ree = r.nextInt(20000);
			Movie m123 = new Drama(tOut, tOut, ree, n2);
			si.storeData.addMovie(m123);
			tOut = "";
		}
		
		//LinkedList<String> list = new LinkedList<>();
		//list.add("string");
		//list.add("string2");
		//System.out.println(list);
		*/
		si.print();
		
		System.out.println();
		si.printCustomers();
		si.allowTransaction(4444, 1);
		si.allowTransaction(4444, 2);
		si.allowTransaction(4444, 2);
		si.allowTransaction(4444, 2);
		si.allowTransaction(4444, 2);
		si.allowTransaction(4444, 2);
		
		//si.print();
		//si.print();
		//si.storeData.printBtreeDirector();
		si.storeData.printBTreeStock();
		//Scanner con = new Scanner(System.in);
		//con.nextLine();
		//si.storeData.printBtreeTitle();
		//si.printList();
		System.out.println(si.storeData.tlog);
		System.exit(0);
		
		
		
		/*Storage st = new Storage();
		Movie m1 = new Comedy("The Producers", "Mel Brooks", 9, 2011);
		Movie m2 = new Comedy("Multiplicity", "Harold Ramis", 6, 2012);
		Movie m3 = new Comedy("The Tramp", "Charlie Chaplin", 23, 2014);
		Movie m4 = new Comedy("Animal House", "John Landis", 1340, 20534);
		Movie m5 = new Comedy("Uncle Buck", "John Hughes", 1234, 2023);
		Movie m6 = new Comedy("Rumor Has It...", "Rob Reiner", 104, 20111);
		Movie m7 = new Comedy("Burn After Reading", "Coen Brothers", 1024, 2120);
		st.addMovie(m1);
		st.addMovie(m2);
		st.addMovie(m3);
		st.addMovie(m4);
		st.addMovie(m5);
		st.addMovie(m6);
		st.addMovie(m7);
		st.printBtreeTitle();
		System.out.println();
		st.printBtreeDirector();
		System.out.println();
		st.printBTreeStock();
		System.out.println();
		
		System.out.println(String.format("%60s","Chronological Add Order"));
		System.out.println();
		st.printList();*/
		

	}

}
