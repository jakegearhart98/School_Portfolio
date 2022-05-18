import java.util.Random;

public class Int2DArrayDemo {

	public static void main(String[] args) {
		int [][] testArray = {{1, 2, 3},
	                        {4, 5, 6},
	                        {7, 8, 9},
	                        {10, 11, 12}};
		for (int i=0; i<testArray.length; i++) {
			for (int j=0; j<testArray[i].length; j++)
				System.out.print(testArray[i][j] + " ");
			System.out.println();
		}
		

		Random gen = new Random();
		int [][] temps = new int[12][];
		temps[0] = new int[31];
		temps[1] = new int[29];
		temps[2] = new int[31];
		temps[3] = new int[30];
		temps[4] = new int[31];
		temps[5] = new int[30];
		temps[6] = new int[31];
		temps[7] = new int[31];
		temps[8] = new int[30];
		temps[9] = new int[31];
		temps[10] = new int[30];
		temps[11] = new int[31];

		for (int i=0; i<temps.length; i++)
			for (int j=0; j<temps[i].length; j++)
				temps[i][j] = gen.nextInt(100);

		for (int i=0; i<temps.length; i++) {
			for (int j=0; j<temps[i].length; j++)
				System.out.print(temps[i][j] + " ");
			System.out.println();
		}

	}
}