//Jacob Gearhart
//R2
import java.util.Scanner;

public class Rtwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r1 = 0; int r2 = 0; int s1 = 0;
		
		r1 = sc.nextInt();
		s1 = sc.nextInt();
		
		r2 = (s1*2)-r1;
		
		System.out.println(r2);
	}

}
