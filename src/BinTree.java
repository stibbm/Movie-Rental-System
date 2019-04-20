/**
 * 
 */


/**
 * @author Matthew Stibbins 2/14/2018
 *
 */
public class BinTree {
	// HAVE A STATIC LIST OF COMPARE TYPES TO GRAB FROM BASED ON COMPARE TYPE INT STORED
	// 
	// ALLOW ABILITY TO SET A BACK UP CRITERIA FOR HOW TO DETERMINE RELATIVE ORDERING IF THE VALUES FOR THE FIRST CONDITION ARE EQUAL
	TreeNode root=null;
	int compareType;
	String SPACING;
	/**
	 * 
	 */
	// 1 = title
	// 2 = 
	
	
	/**
	 * Print our the sorted data. State the sorting condition this tree is following
	 */
	public void print() {
		int spacing = Integer.parseInt(this.SPACING);
		int centerAlign = spacing *30;
		String CENTER =  Integer.toString(centerAlign);
		System.out.println();
		
		// sort condition title/label header
		if(compareType==1) {
			System.out.println(String.format("%-" + (spacing*3) +"s", "Sorted By Title"));
		}
		
		
		// sort condition director name header
		else if(compareType==2) {
			System.out.println(String.format("%-" + (spacing*3) +"s", "Sorted By Director"));
		}
		
		// sort condition stock amount header
		else if(compareType==3) {
			System.out.println(String.format("%-" + (spacing*3) +"s", "Sorted By Stock"));
		}
		
		// sort condition release date header
		else if(compareType==4) {
			System.out.println(String.format("%-" + (spacing*3) +"s", "Sorted By Release Date"));
		}
		System.out.println();
		
		// labels for the columns of data
		String header = String.format("%" + SPACING + "s", "Title") + " " +  String.format("%" + SPACING + "s", "Director") + " " +  String.format("%" + SPACING + "s", "Stock") +" " + String.format("%" + SPACING + "s", "Date") +" " + String.format("%" + SPACING + "s", "Genre");
		System.out.println(header);
		for(int i=0;i<centerAlign/5;i++)
		System.out.print("-");
		System.out.println();
			//System.out.println("--------------------------------------------------------------------------------------------------------");
		if(root!=null)
		inOrder(root);
		for(int i=0;i<4;i++)
			System.out.println();
	}
	
	/**
	 * InOrder printout of tree
	 * @param root
	 */
	private void inOrder(TreeNode root) {
		if(root!=null) {
			inOrder(root.left);
			//System.out.println(String.format("%-15s", root.data.toString()));
			System.out.println(root.data.toString());
			inOrder(root.right);
		}
	}
	
	
	
	/**
	 * Construct BinTree with the specified sorting condition
	 * @param compareType
	 */
	public BinTree(int compareType) {
		this.compareType=compareType;
		if(compareType !=1 && compareType!=2 && compareType!=3 && compareType!=4) {
			this.compareType = 1;
		}
		root = null;
	}
	
	/**
	 * Add to the tree
	 * @param mov
	 */
	public void add(Movie mov) {
		if(root==null) {
			this.SPACING = Movie.SPACING;
			root = new TreeNode(mov);
		}
		else {
			addHelper(root, mov);
		}
	}
	
	/** 
	 * Recursive add method dependent on the sort condition
	 * @param root
	 * @param value
	 */
	private void addHelper(TreeNode root, Movie value) {
		if(root==null) {
			
		}
		else {
			
			// sort condition 1 the title/label
			if(compareType == 1 && value.compareByTitle(root.data)>0) {
				
				// fill right hole
				if (root.right == null) {
					root.right = new TreeNode(value);
				}
				
				// follow right
				else {
					addHelper(root.right, value);
				}
			}else if(compareType==1 && value.compareByTitle(root.data)<0) {
				
				// fill left hole
				if(root.left==null) {
					root.left = new TreeNode(value);
				}
				
				// follow left
				else {
					addHelper(root.left, value);
				}
			}
			
			
			
			
			// sort condition 2 the directors name
			else if(compareType==2 && value.compareByDirector(root.data)>=0) {
				
				// fill right hole
				if(root.right == null) {
					root.right = new TreeNode(value);
				}
				
				// follow right
				else {
					addHelper(root.right, value);
				}
			}else if(compareType==2 && value.compareByDirector(root.data)<0) {
				
				// fill left
				if(root.left == null) {
					root.left = new TreeNode(value);
				}
				
				// follow left
				else {
					addHelper(root.left, value);
				}
			}
			
			
			// sort condition 3 the stock amount
			else if(compareType==3 && value.compareByStock(root.data)>=0) {
				
				// fill right
				if(root.right == null) {
					root.right = new TreeNode(value);
				}
				
				// follow right
				else {
					addHelper(root.right, value);
				}
				
			}
			else if(compareType==3 && value.compareByStock(root.data)<0) {
				
				// fill left
				if(root.left == null) {
					root.left = new TreeNode(value);
				}
				
				// follow left
				else {
					addHelper(root.left, value);
				}
			}
			
			
			
			// sort condition 4 the date
			else if(compareType==4 && value.compareByDate(root.data)>=0) {
				
				// fill right
				if(root.right == null) {
					root.right = new TreeNode(value);
				}
				
				// follow right
				else {
					addHelper(root.right, value);
				}
			}
			else if(compareType==4 && value.compareByDate(root.data)<0) {
				
				// fill left
				if(root.left == null) {
					root.left = new TreeNode(value);
				}
				
				// follow left
				else {
					addHelper(root.left, value);
				}
			}
			
			
			
			
			else {
				// they are equal
			}
			
		}
		
		
	}

}
