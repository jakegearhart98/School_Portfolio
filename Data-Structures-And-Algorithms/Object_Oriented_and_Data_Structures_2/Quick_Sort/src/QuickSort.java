/*
 * Jacob Gearhart
 * CSCI333
 * Quicksort HW3
 * 2/6/2022
 * Quick Sort Class: provide an array of any int values, gets sorted with quicksort method
 */
import java.util.Random;
public class QuickSort {

	/*
	 * Partitions data for quicksort method
	 */
	private static int partition(int[] arr, int p, int r) {
		int pivot = arr[r];
		int i = p-1;
		
		for(int j = p; j <= r - 1; j++) {
			if(arr[j] <= pivot) {
				i = i + 1;
				swapItem(arr, i, j);
			}
		}
		swapItem(arr, i + 1, r);
		return i + 1;
	}
	
	/*
	 * standard pivot quicksort
	 */
	private static void quickSort(int[] arr, int p, int r) {
		if (p < r) {
			int q = partition(arr, p, r);
			quickSort(arr, p, q - 1);
			quickSort(arr, q + 1, r);
		}
	}
	
	/*
	 * random pivot quicksort
	 */
	private static void randomQuickSort(int[] arr, int p, int r) {
		if(p < r) {
			Random gen = new Random();
			int random = gen.nextInt(r-p)+p;
			swapItem(arr, random, r);
			
			int q = partition(arr, p, r);
			randomQuickSort(arr, p, q-1);
			randomQuickSort(arr,q +1, r);
		}
	}
	/*
	 * Swaps values of given index in provided array
	 */
	private static void swapItem(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	
	/*
	 * prints your array
	 */
	private static void printArray(int arr[]) {
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");

	}
	
	public static void main(String[] args) {
		int arr[] = {887, 137, 168, 821, 743, 306, 763, 781};
		System.out.println("arr before sort");
		printArray(arr);
		quickSort(arr, 0, arr.length - 1);
		System.out.println("Sort invoked");
		printArray(arr);
		System.out.println();
		//
		int arr3[] = {789,879,64,1,68,7,9846,132,4879,5654,442};
		System.out.println("arr before sort");
		printArray(arr3);
		quickSort(arr3, 0, arr3.length - 1);
		System.out.println("Sort invoked");
		printArray(arr3);
		System.out.println();
		//
		int arr4[] = {1,66,444,234,456,453,9976,546};
		System.out.println("arr before sort");
		printArray(arr4);
		quickSort(arr4, 0, arr4.length - 1);
		System.out.println("Sort invoked");
		printArray(arr4);
		System.out.println();
		//
		int arr5[] = {1,3,5,7,2,4,6,8};
		System.out.println("arr before sort");
		printArray(arr5);
		quickSort(arr5, 0, arr5.length - 1);
		System.out.println("Sort invoked");
		printArray(arr5);
		System.out.println();
		//
		int arr6[] = {4654,8,7962,43,887,543,11111};
		System.out.println("arr before sort");
		printArray(arr6);
		quickSort(arr6, 0, arr6.length - 1);
		System.out.println("Sort invoked");
		printArray(arr6);
		System.out.println();
		//end normal quicksorts
		
		System.out.println("Start of random QuickSorts:");
		System.out.println();
		int arr2[] = {2,65,88,12,76,34,55,9};
		System.out.println("arr before random quicksort");
		printArray(arr2);
		randomQuickSort(arr2, 0, arr2.length - 1);
		System.out.println("Random quicksort invoked");
		printArray(arr2);
		System.out.println();
		//
		int arr7[] = {234,756,978,5432,987,3452,897,342};
		System.out.println("arr before random quicksort");
		printArray(arr7);
		randomQuickSort(arr7, 0, arr7.length - 1);
		System.out.println("Random quicksort invoked");
		printArray(arr7);
		System.out.println();
		//
		int arr8[] = {546,897,645,132,465,978,78984,4,45,63654,897};
		System.out.println("arr before random quicksort");
		printArray(arr8);
		randomQuickSort(arr8, 0, arr8.length - 1);
		System.out.println("Random quicksort invoked");
		printArray(arr8);
		System.out.println();
		//
		int arr9[] = {1231,68789,45,1,321,65,897465,15,4};
		System.out.println("arr before random quicksort");
		printArray(arr9);
		randomQuickSort(arr9, 0, arr9.length - 1);
		System.out.println("Random quicksort invoked");
		printArray(arr9);
		System.out.println();
		//
		int arr10[] = {2354,8796,232,657,899,4345,17345};
		System.out.println("arr before random quicksort");
		printArray(arr10);
		randomQuickSort(arr10, 0, arr10.length - 1);
		System.out.println("Random quicksort invoked");
		printArray(arr10);
		System.out.println();
	}

}
