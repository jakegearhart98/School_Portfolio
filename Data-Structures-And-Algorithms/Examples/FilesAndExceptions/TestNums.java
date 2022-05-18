import java.util.Scanner;
import java.util.InputMismatchException;

public class TestNums {

    public static void main(String [] args) {
        Scanner scan = new Scanner("123 fred 456");
        int first = 0, second = 0, third = 0;

        try {
            first = scan.nextInt();
        }
        catch(InputMismatchException e) {
            System.out.println("Input not an integer; skipping, using 0 for first.");
            scan.next();
        }

        try {
            second = scan.nextInt();
        }
        catch(InputMismatchException e) {
            System.out.println("Input not an integer; skipping, using 0 for second.");
            scan.next();
        }
        
        try {
            third = scan.nextInt();
        }
        catch(InputMismatchException e) {
            System.out.println("Input not an integer; skipping, using 0 for third.");
            scan.next();
        }    
        
        System.out.println(first + " " + second +  " " + third);    
    }

}