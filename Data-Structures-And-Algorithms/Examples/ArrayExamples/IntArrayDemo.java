public class IntArrayDemo {
	
	public static void main(String[] args) {
		
		int [] a = {12, 7, 4, 3, 19, 24, 6};
		for (int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();


		int [] b = new int[12];
		b[6] = 3;
		for (int i=0; i<b.length; i++)
			System.out.print(b[i] + " ");
		System.out.println();

	}
}