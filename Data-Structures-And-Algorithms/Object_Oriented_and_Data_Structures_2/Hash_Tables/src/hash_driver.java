
public class hash_driver {

	public static void main(String[] args) {
		int scale = 2;
		ChainedHashTable hash1 = new ChainedHashTable(19);
		for(int i = 1; i <= 20; i++) {
			hash1.insert(scale);
			scale *= 2;
		}
		System.out.println("START OF CHAINED HASH TABLE");
		hash1.printTable();
		
		hash1.delete(1024);
		hash1.delete(2);
		hash1.delete(4096);
		hash1.delete(65536);
		hash1.delete(64);
		System.out.println("After deletion");
		hash1.printTable();
		
		System.out.println("Search\n");
		System.out.println(hash1.search(4));
		System.out.println(hash1.search(512));
		System.out.println(hash1.search(22));
		System.out.println(hash1.search(14));
		System.out.println(hash1.search(1));
		System.out.println("END OF CHAINED HASH TABLE\n\n");
		
		System.out.println("START OF OPEN ADRESSED HASH TABLE\n");
		int scale2 = 2;
		
		OpenAddressedHashTable hash2 = new OpenAddressedHashTable(19);
		for(int i = 1; i <= 20; i++) {
			hash2.insert(scale2);
			scale2 *= 2;
		}
		/*hash2.printTable();
		
		hash2.delete(1024);
		hash2.delete(2048);
		hash2.delete(4096);
		hash2.delete(128);
		hash2.delete(8192);
		hash2.printTable();
		
		System.out.println("NOT IN TABLE");
		System.out.println(hash2.delete(1));
		System.out.println(hash2.delete(3));
		System.out.println(hash2.delete(12));
		System.out.println(hash2.delete(17));
		System.out.println(hash2.delete(20));
		System.out.println("\nAFTER DELETION");
		hash2.printTable();*/
		
	}

}
