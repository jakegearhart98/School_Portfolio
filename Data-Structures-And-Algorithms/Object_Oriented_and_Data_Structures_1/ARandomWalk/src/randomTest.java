import java.util.Random;
public class randomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largest = 0;
		int[] array = {4,2,5,8,6,17,10,12,4,3};
		for(int i = 0; i< array.length; i++) {
			if(array[i] > largest) {
				largest = array[i];
			}
		}
		System.out.print(largest);
	}

}
