/*Jacob Gearhart
 *CSCI333
 *Heaps Homework2
 *1/27/2022
 *Driver for Homework 2, printed out based on instructors instructions
 */
import java.util.Arrays;

public class MaxHeapDriver {
	public static void main(String [] args) {
	int arr[] = {2,65,88,12,76,34,55,9,1,};
	System.out.println("Original array");
	System.out.println(Arrays.toString(arr));
	MaxHeap heap = new MaxHeap(arr);
	heap.printMaxHeap();
	heap.heapSort();
	System.out.println("Heapsort Invoked");
	heap.printMaxHeap();
	System.out.println();
	//
	int arr2[] = {99, 2, 3, 4, 12};
	System.out.println("Original array");
	System.out.println(Arrays.toString(arr2));
	MaxHeap heap2 = new MaxHeap(arr2);
	heap2.printMaxHeap();
	heap2.heapSort();
	System.out.println("Heapsort Invoked");
	heap2.printMaxHeap();
	System.out.println();
	//
	int arr3[] = {456,3,867,2345,8,4,65,78};
	System.out.println("Original array");
	System.out.println(Arrays.toString(arr3));
	MaxHeap heap3 = new MaxHeap(arr3);
	heap3.printMaxHeap();
	heap3.heapSort();
	System.out.println("Heapsort Invoked");
	heap3.printMaxHeap();
	System.out.println();
	//
	int arr4[]= {654,798,165,132,456,897,465,1,32,57,798,2,31,5,4};
	System.out.println("Original array");
	System.out.println(Arrays.toString(arr4));
	MaxHeap heap4 = new MaxHeap(arr4);
	heap4.printMaxHeap();
	heap4.heapSort();
	System.out.println("Heapsort Invoked");
	heap4.printMaxHeap();
	System.out.println();
	//
	int arr5[] = {1,3,5,8,2,4,6,7,9};
	System.out.println("Original array");
	System.out.println(Arrays.toString(arr5));
	MaxHeap heap5 = new MaxHeap(arr5);
	heap5.printMaxHeap();
	heap5.heapSort();
	System.out.println("Heapsort Invoked");
	heap5.printMaxHeap();
	
	}
}
