//Jacob Gearhart
//Bijele
import java.util.Scanner;

public class Bijele {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] base = {1,1,2,2,2,8};int[] input = new int[6];
		int[] temp = new int[6];
		for(int i = 0; i < base.length; i++) { //gets user input
			input[i] = sc.nextInt();
		}
		for(int i = 0; i < base.length; i++) {
			temp[i] = base[i]-input[i];
			System.out.print(temp[i] + " ");
		}
	}

}
