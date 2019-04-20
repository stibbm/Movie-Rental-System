/**
 * 
 */


/**
 * Basic Tree Node for bintree
 * @author Matthew Stibbins 2/14/2018
 * 
 *
 */
public class TreeNode {

	Movie data=null;
	TreeNode right=null;
	TreeNode left=null;
	
	
	/**
	 * basic tree node constructor with movie as the data
	 */
	public TreeNode(Movie data) {
		this.data = data;
		this.right = null;
		this.left = null;
	}
	
	public String toString() {
		return data.toString();
	}

}
