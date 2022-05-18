//Jacob Gearhart
//Oddities
import java.util.Scanner;

public class Oddities {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int value = sc.nextInt();
			if(value % 2 == 0 ) {
				System.out.println(value + " is even");
			}
			if(value % 2 != 0) {
				System.out.println(value + " is odd");
			}
		}

	}

}
