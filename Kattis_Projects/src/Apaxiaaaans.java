//Jacob Gearhart
//Apaxiaaaaaaaaaaaaaaaaaaaaaaaaans
import java.util.Scanner;

public class Apaxiaaaans {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
            char[] charWord=(sc.next() + " ").toCharArray();
            String name="";
            for(int i=0;i<charWord.length-1;i++){
                if(charWord[i] != charWord[i+1]) {
                	name+=charWord[i];
            }
           
        }
            System.out.println(name);
    }
	}
}
