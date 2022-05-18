//Jacob Gearhart
//Pot
import java.util.Scanner;
import java.lang.Math;

public class pot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); int result = 0;
		
		for(int i = 0; i < input; i++) {
			int next = sc.nextInt();
			int num = next/10;
			int power = next%10;
			result += Math.pow((double)num, (double)power);
		}
		System.out.println(result);
	}

}
