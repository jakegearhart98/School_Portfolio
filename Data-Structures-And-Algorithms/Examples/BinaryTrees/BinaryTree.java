public class BinaryTree {

	public static final BinaryTree EMPTYTREE = 
	                                new BinaryTree(Integer.MIN_VALUE,null,null);

	private int key;
	private BinaryTree leftChild;
	private BinaryTree rightChild;
	
	public BinaryTree(int key, BinaryTree leftChild, BinaryTree rightChild) {
		this.key = key;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	public BinaryTree find(int item) {
		if (item == key) return this;
		else if (item < key) return leftChild.find(item);
		else return rightChild.find(item);
	}

	public BinaryTree insert(int item) {
		if (this == EMPTYTREE)
			return new BinaryTree(item, EMPTYTREE, EMPTYTREE);
		else if (item < key)
			return new BinaryTree(key, leftChild.insert(item), rightChild);
		else return new BinaryTree(key, leftChild, rightChild.insert(item));
	}
	
	public void printInOrder() {
		if (this != EMPTYTREE) {
			leftChild.printInOrder();
			System.out.println(key);
			rightChild.printInOrder();
		}
	}
	
	public void printPreOrder() {
		if (this != EMPTYTREE) {
			System.out.println(key);
			leftChild.printPreOrder();
			rightChild.printPreOrder();
		}
	}
	
	public void printPostOrder() {
		if (this != EMPTYTREE) {
			leftChild.printPostOrder();
			rightChild.printPostOrder();
			System.out.println(key);
		}
	}
}