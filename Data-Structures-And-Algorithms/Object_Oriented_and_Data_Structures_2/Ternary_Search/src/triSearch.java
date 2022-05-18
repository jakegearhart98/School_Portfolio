/*
 * Jacob Gearhart
 * Algorithims and Data Structures CSCI 333-001
 * Recursion HW1
 * 1/20/2022
 * Trinary search assignment, search will execute recursively
 */

public class triSearch {
	/**
	 * Trinary search breaks array into 3 parts looking for a lesser or greater value, then does that again. The search bounds will become smaller and smaller.
	 * Eventually either finding the data and returning the index of the item within the array, or returning -1 if the item is not found.
	 * Provide an array (arr), search term (x), then the starting and ending index value of arr[]
	 * 
	 * @param mid1 : first 3rd of trinary split
	 * @param mid2 : second 3rd of trinary split
	 * @return mid1 : index value of search term in array
	 * @return mid2 : index value of search term in array
	 */
	public static int trinarySearch(int arr[], int x, int front, int end) {
		
		while(end >= front) {
			
			int mid1 = front+(end - front)/3;
			int mid2 = end - (end-front)/3;
			
			if(arr[mid1] == x) {
				if(arr[mid1] == arr[mid1 - 1]) {
					return trinarySearch(arr,x,front,mid1);
				}
				return mid1;
			}
			if(arr[mid2] == x) {
				if(arr[mid2] == arr[mid2 - 1]) {
					return trinarySearch(arr,x,mid1,mid2);
				}
				return mid2;
			}
			
			if(arr[mid1] > x) {
				return trinarySearch(arr, x, front, mid1-1);
			}
			else if (arr[mid2] < x) {
				return trinarySearch(arr, x, mid2 + 1, end);
			}
			else {
				return trinarySearch(arr,x, mid1+1, mid2-1);
			}
		}
		return -1;
	}
	
	/**
	 * Each println tests a different "case" of the trinary search
	 * @param arr : array that holds search values. has repeats
	 * @param arr2 : array that holds search values. ascending
	 * @param arr3 : array that holds search values. size 3
	 */
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,3,3,3,3,3,3,12,14,15,16,16,16,16,16,16,16,16,16,18,19,20};
		int[] arr2 = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int[] arr3 = {45,77,98};
		System.out.println("First occurrence of 16 at index: " + trinarySearch(arr, 16, 0, arr.length));
		System.out.println("First occurrence of 3 at index: " + trinarySearch(arr, 3, 0, arr.length));
		System.out.println("First occurrence of 14 at index: " + trinarySearch(arr2, 14, 0, arr2.length));
		System.out.println("First occurrence of 77 at index: " + trinarySearch(arr3, 77, 0, arr3.length));
		System.out.println("First occurrence of 20 at index: " + trinarySearch(arr, 20, 0, arr.length));
		System.out.println("First occurence of 17 at index: " + trinarySearch(arr, 17, 0 , arr.length));
	}

}
