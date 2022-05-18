
public class BinarySearchTree {
	
	private BSTNode root;
	private int size; //number of elements in tree
	
	public BinarySearchTree() {
		this.root = null;
		this.size = 0;
	}
	
	/**
	 * 
	 * @return number of nodes in tree
	 */
	public int getSize() {
		return size;
	}
	
	private void transplant(BinarySearchTree tree, BSTNode u, BSTNode v) {
		if(u.getP() == null) {
			tree.root = v;
		} else if(u == u.getP().getLeft()) {
			u.getP().setLeft(v);
		} else {
			u.getP().setLeft(v);
		}
		if(v != null) {
			v.setP(u.getP());
		}
	}
	
	/**
	 * 
	 * @param root root node of bst
	 * @param k search key
	 */
	private BSTNode search(BSTNode root, int k) {
		BSTNode wrap = root;
		if(root == null) {
			return null;
		}
		if(k == root.getKey()) {
			return root;
		}
		if(k < root.getKey()) {
			return search(root.getLeft(), k);
		} else return search(root.getRight(), k);
	}
	
	private BSTNode maximum(BSTNode x) {
		while(x.getRight() != null) {
			x = x.getRight();//may need to do x.setRight
		}
		return x;
	}
	
	private BSTNode minimum(BSTNode x) {
		while (x.getLeft() != null) {
			x = x.getLeft();
		}
		return x;
	}
	
	private BSTNode successor(BSTNode x) {
		if(x.getRight() != null) {
			return minimum(x.getRight());
		}
		while(x.getP() != null && x == x.getP().getRight()) {
			x = x.getP();
		}
		return x.getP();
	}
	
	private BSTNode predecessor(BSTNode x) {
		if(x.getLeft() != null) {
			return maximum(x.getLeft());
		}
		while(x.getP() != null && x == x.getP().getLeft()){
			x = x.getP();
		}
		return x.getP();
	}
	
	private void insert(BinarySearchTree tree, BSTNode z) {
		BSTNode y = null;
		BSTNode x = tree.root;
		while(x != null) {
			y = x;
			if (z.getKey() < x.getKey()) {
				x = x.getLeft();
			} else {
				x = x.getRight();
			}
		}
		z.setP(y);
		if(y == null) {
			tree.root = z;
		} else if(z.getKey() < y.getKey()){
			y.setLeft(z);
			
		} else {
			y.setRight(z);
			
		}
	}
	
	private void delete(BinarySearchTree tree, BSTNode z) {
		if(z.getLeft() == null) {
			transplant(tree, z, z.getRight());
		} else if(z.getRight() == null) {
			transplant(tree, z, z.getLeft());
		} else {
			BSTNode y = minimum(z.getRight());
			if (y.getP() != z) {
				transplant(tree, y, y.getRight());
				y.setRight(z.getRight());
				y.getLeft().setP(y);
				
			}
		}
	}
	
	private void preOrderTraversal(BSTNode t) {
		if(t != null) {
			System.out.println(t.getKey());
		}
		preOrderTraversal(t.getLeft());
		preOrderTraversal(t.getRight());
	}
	
	private void inOrderTraversal(BSTNode t) {
		if(t != null) {
			inOrderTraversal(t.getLeft());
			System.out.println(t.getKey());
			inOrderTraversal(t.getRight());
			}
		}
	
	private void postOrderTraversal(BSTNode t) {
		if(t != null) {
			postOrderTraversal(t.getLeft());
			postOrderTraversal(t.getRight());
			System.out.println(t.getKey());
		}
	}
}
