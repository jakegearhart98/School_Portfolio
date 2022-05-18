/**
 * 
 * @author Jacob Gearhart
 *Algorithms and Data Structures CSCI 333-001
 *Hash Tables HW5
 *3/02/2022
 *Chained Hash Table Class, make chained hash table with linked lists
 */
import java.util.Random;
import java.util.LinkedList;
import java.util.Arrays;

public class ChainedHashTable {
	
	private LinkedList<Integer>[] table;
	private int n;
	
	/**
	 * 
	 * @param n : Number of inputs expected
	 * 
	 * Constructor for array of linked lists, initilizes size based upon expected inputs
	 */
	public ChainedHashTable(int n) {
		this.n = n;
		this.table = new LinkedList[determineSize(n)];
		for(int i = 0; i < table.length; i++) {
			table[i] = new LinkedList<Integer>();
		}
	}
	
	/**
	 * Prints chained hash table in readable format
	 */
	public void printTable() {
		for(int i = 0; i < table.length; i++) {
			System.out.println(table[i].toString());
		}
		System.out.println();
	}
	
	/**
	 * 
	 * @param x : element to insert into hash table
	 */
	public void insert(int x) {
		table[hash(x)].add(x);
	}
	
	/**
	 * 
	 * @param k : key of item you are searching for
	 * @return returns first item of hashed index of key
	 */
	
	public Integer search(int k) {
		System.out.print("Value of hash(k): " + hash(k));
		if(table[hash(k)].contains(hash(k)) == false) {
			System.out.println(table[hash(k)]);
			return null;
		}
		int send = table[hash(k)].getFirst();
		return table[hash(k)].getFirst();
	}
	
	/**
	 * 
	 * @param x : item you want to delete
	 */
	public void delete(int x) {
		table[hash(x)].remove(table[hash(x)].indexOf(x));
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
	
	/**
	 * 
	 * @param key : element to be hashed
	 * @param a : just a constant
	 * @return returns output of hash function
	 * Hash function uses the multiplication method
	 */
	private int hash(int key) {//multiplication method
		double a = 0.6123875;
		double hash = (table.length * ((key*a) % 1));
		//System.out.println("HASH VALUE for " + key + ": " + hash);
		return (int)hash;
	}
	
/*	public static void main(String[] args) {
		ChainedHashTable hash1 = new ChainedHashTable(4);
		hash1.insert(6);
		hash1.insert(2345);
		hash1.insert(7354634);
		hash1.insert(23459);
		hash1.insert(10);
		
		hash1.delete(6);
		hash1.printTable();
		System.out.println(hash1.search(0));
	}*/

}
