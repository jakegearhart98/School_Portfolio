//Jacob Gearhart
//Cold-puter Science
import java.util.Scanner;
public class Coldputer_Science {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int above = 0;
		int iterate = sc.nextInt();
		for(int i = 0; i < iterate; i++) {
			int in = sc.nextInt();
			if(in < 0) above++;
		}
		System.out.println(above);
	}

}
