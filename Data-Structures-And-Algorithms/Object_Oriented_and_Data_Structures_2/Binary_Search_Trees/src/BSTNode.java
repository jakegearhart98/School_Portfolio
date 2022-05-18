/**
 * 
 * @author Jacob Gearhart
 * Date
 * Assignment
 * Description 
 *
 */
public class BSTNode {
	
	private int key, size;
	private BSTNode left, right, p;
	
	public BSTNode(int key) {
		this.key = key;
		this.left = null;
		this.right = null;
		this.p = null;
		this.size = 0;
	}
	
	/**
	 * 
	 * @return value of key
	 */
	public int getKey() {
		return key;
	}
	
	/**
	 * 
	 * @return value of parent node
	 */
	public BSTNode getP() {
		return p;
	}
	
	/**
	 * 
	 * @return value of left node
	 */
	public BSTNode getLeft() {
		return left;
	}
	
	/**
	 * 
	 * @return value of right node
	 */
	public BSTNode getRight() {
		return right;
	}
	
	public void setP(BSTNode parent) {
		p = parent;
	}
	
	public void setLeft(BSTNode l) {
		left = l;
	}
	
	public void setRight(BSTNode r) {
		right = r;
	}
}
