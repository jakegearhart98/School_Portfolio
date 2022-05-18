//Jacob Gearhart
//Aboveavg

import java.util.Scanner;

public class AboveAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int dataAmount = sc.nextInt();
        
        
        for(int i = 0; i < dataAmount; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            double avg = 0;
            	for(int j=0;j<n;j++){
            		arr[j]=sc.nextInt();
            		avg+=arr[j];
            	}
            avg = avg/n;
            int above=0;
            for(int j=0;j<n;j++) {
            	if(arr[j]>avg) {
            		above++;
            	}
            }
            System.out.printf("%.3f%s  \n",(double)above/n*100,"%");
        }

	}

}
