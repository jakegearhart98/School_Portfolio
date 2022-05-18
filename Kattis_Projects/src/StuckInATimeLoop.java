//Jacob Gearhart

import java.util.Scanner;
public class StuckInATimeLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			System.out.println(i + " Abracadabra");
		}
	}

}
