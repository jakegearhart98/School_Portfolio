
import java.util.Arrays;
import java.lang.Integer;
public class OpenAddressedHashTable {

	private Integer[] table;
	private int n;
	static final int deleted = Integer.MIN_VALUE;
	/**
	 * @param n expected inputs
	 * Constructor for an open addressed hash table
	 */
	public OpenAddressedHashTable(int n) {
		this.n = n;
		this.table = new Integer[determineSize(n)];
	}
	
	public Integer search(int k) {
		for(int i = 0; i < table.length; i++) {
			int j = hash(k, i);
			if(table[j] == null) {
				return null;
			}
			if(hash(table[j]) == k) {
				return table[j];
			}
		}
		return null;
	}
	
	public Integer insert(int x) {
		int k = hash(x);//key for hash function
		for(int i = 0; i < table.length; i++) {
			int j = hash(k, i);
			if(table[j] == null || table[j] == deleted) {
				table[j] = x;
				return j;
			}
		}
		return -1;
	}
	
	 /**
	  * makes size nearest power of 2
	  * @param n total number of inputs expected
	  * @return size size of array
	  */
	private int determineSize(int n) {
		int power = 1;
		int size = 2;
		while(size <= n) {
			size = (int) Math.pow(2,power);
			power++;
		}
		return size;
	}
	
	public void printTable() {
		for(int i = 0; i < table.length; i++) {
			System.out.print(table[i] + " ");
		}
		System.out.println();
	}
	
	public Integer delete(int x) {
		int k = hash(x);
		for(int i = 0; i < table.length; i++) {
			int j = hash(k, i);
			System.out.println("Value of table j: " + table[j]);
			if(hash(table[j]) == k) {
				
				if(table[j] != x || table[j] == null) {
					return -1;
				}
				table[j] = deleted;
				return j;
			}
		}
		return null;
		}
	
	/**
	 * 
	 * @param key : element to be hashed
	 * @param a : just a constant
	 * @return returns output of hash function
	 * AUXILLARY Hash function uses the multiplication method
	 */
	private int hash(int key) {
		double a = 0.6123875;
		double hash = (table.length * ((key*a) % 1));
		return (int)hash;
	}
	
	private int hash(int k, int i) {
		int h = (k + i) % table.length;
		//System.out.println("Value of hash function: " + h);
		return h;
	}
	/*public static void main(String[] args) {
		OpenAddressedHashTable hash6 = new OpenAddressedHashTable(3);
		hash6.printTable();
		hash6.insert(8);
		hash6.printTable();
		hash6.insert(11);
		hash6.printTable();
		hash6.insert(7985);
		hash6.insert(99);
		hash6.printTable();
		System.out.println(hash6.search(1));
		hash6.delete(3);
		hash6.printTable();
		hash6.insert(8);
		hash6.printTable();
	}*/

}
