/*Jacob Gearhart
 *CSCI333
 *Heaps Homework2
 *1/27/2022
 *MaxHeap class: input is array filled with arbitrary data, restructures data to form valid heap then sorts
 *data if desired
*/

public class MaxHeap {
	/**
	 * @param arr[] array that stores arbitrary values entered
	 * @param heapsize size of heap
	 */
	private int arr[];
	private int heapsize;
	
	public MaxHeap(int arr[]) {
		this.arr = arr;
		this.heapsize = arr.length - 1;
		buildMaxHeap();
	}
	/*
	 * Recursive iteration only occurs on heapsize/2 nodes so no leaves are "root" of subproblem
	 * Makes valid heap
	 */
	void buildMaxHeap() {
		for(int i = heapsize/2; i >= 1; i--) {
			maxHeapify(i);
		}
		//maxHeapify(heapsize/2);
	}
	
	/*
	 * Fixes array and makes valid heap recursively
	 */
	private void maxHeapify(int i) {
		int largest;

		if(leftChild(i) <= heapsize && arr[leftChild(i)] > arr[i]) {
			largest = leftChild(i);
		}
		else largest = i;
		
		if(rightChild(i) <= heapsize && arr[rightChild(i)] > arr[largest]) {
			largest = rightChild(i);
		}
		
		if(largest != i) {//swaps values
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			maxHeapify(largest);
		}
	}
	/*
	 * Sorts valid heap in ascending order
	 */
	public void heapSort() {
		buildMaxHeap();
		int temp;
		int copy = heapsize;
		for(int i = heapsize; i >= 1; i--) {
			temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapsize--;
			maxHeapify(0);
		}
		heapsize = copy;
	}
	/*
	 * Prints out heap
	 */
	public void printMaxHeap() {
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	/**
	 * @param index you are trying to find left child of
	 * @return right returns value of right index of child
	 */
	private int leftChild(int index) {
		int left = (2 * index) + 1;
		return left;
	}
	
	/**
	 * @param index index you are trying to find right child of
	 * @return right returns value of right index of child
	 */
	private int rightChild(int index) {
		int right = (2 * index) + 2;
		return right;
	}
}
