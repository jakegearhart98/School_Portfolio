import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class TestFiles {

    public static void main(String [] args) {
            
        if (args.length < 2) {
            System.out.println("Usage: java TestFiles <infilename> <outfilename>");
            System.exit(0);
        }
        
        File input = new File(args[0]);        
        Scanner reader = null;
        try {
            reader = new Scanner(input);
        }
        catch(FileNotFoundException e) {
            System.out.println("Input file " + args[0] + " does not exist.");
            System.exit(0);
        }
        
        PrintWriter output = null;
        try {
            output = new PrintWriter(args[1]);
        }
        catch(FileNotFoundException e) {
            System.out.println("Unknown error opening " + args[1]);
            System.exit(0);
        }
        
        double total = 0.0;
        double value = 0.0;
        while (reader.hasNextDouble()) {
            value = reader.nextDouble();
            output.printf("%15.2f\n", value);
            total = total + value;
        }
        output.printf("Total: %8.2f\n", total);
        
        reader.close();
        output.close();
    }

}