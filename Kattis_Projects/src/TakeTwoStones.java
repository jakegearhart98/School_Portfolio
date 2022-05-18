//Jake Gearhart
import java.util.Scanner;
public class TakeTwoStones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x % 2 == 0) {
			System.out.println("Bob");
		}
		if(x % 2 != 0) {
			System.out.println("Alice");
		}
	}

}
