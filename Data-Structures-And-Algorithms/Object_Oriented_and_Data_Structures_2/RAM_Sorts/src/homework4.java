/**
 * 
 * @author Jacob Gearhart
 * 2/19/2022
 * CSCI 333
 * Homework 4
 * Examples of RAM Model Sorting Algorithms and Randomized Quickselect
 */

import java.util.Arrays;
import java.util.Random;

public class homework4 {
	/*
	 * Swaps values of given index in provided array (Used by partition)
	 */
	private static void swapItem(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
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
	
	/**
	 * Uses partition from quicksort algorithm to find item at ith order statistic
	 * Uses a random pivot selection
	 * @param arr input array
	 * @param p left bound inclusive
	 * @param r right bound inclusive
	 * @param i order statistic
	 * @return Item at order statistic when sorted
	 */
	private static int randomizedQuickselect(int[] arr, int p, int r, int i) {
		int[] duparr = Arrays.copyOf(arr, arr.length);
		if (p == r) {
			return duparr[p];
		}
		Random gen = new Random();
		int random = gen.nextInt(r-p)+p;
		swapItem(duparr, random, r);
		
		int q = partition(duparr, p, r);
//		System.out.println("q: " + q + "   p: " + p);
		int k = q - p + 1;//order statistic
//		System.out.println("what is k: " + k);
		if (i == k) {
			return duparr[q];
		} else if (i < k) {
			return randomizedQuickselect(duparr, p, q-1, i);
		} else {
		return randomizedQuickselect(duparr, q+1, r, i-k);
		}
	}
	
	/**
	 * 
	 * @param arr input array
	 * @param sort blank array, used to store sorted data
	 * @param k highest number in data
	 * @return sort array of sorted data
	 */
	private static void countingSort(int[] arr, int[] sort, int k) {
		int[] c = new int[k + 1];
		
		for(int i = 0; i <= k; i++) {//initializes all items indexes in c to 0
			c[i] = 0;
		}
		for(int i = 0; i < arr.length; i++) {
			c[arr[i]]++;
		}
		//System.out.println("Number of occurrences for each value " + Arrays.toString(c));
		for(int i = 1; i <= k; i++) {
			c[i] = c[i] + c[i-1];
		}
		//System.out.println("Cumulative sum: " + Arrays.toString(c));
		//System.out.println("arr.length: " + arr.length);
		//System.out.println("sort length: " + sort.length);
		for(int i = arr.length - 1; i >= 0; i--) {
			sort[c[arr[i]] - 1] = arr[i];
			--c[arr[i]];
		}
		//System.out.println("after it all: " + Arrays.toString(sort));
	}
	
	public static void main(String[] args) {
		int[] arrQ = {2,2,88,76,34,55,9};
		System.out.println("Before select: " + Arrays.toString(arrQ));
		System.out.println("4th order statistic: " + randomizedQuickselect(arrQ, 0, arrQ.length - 1, 4) + "\n");
		
		int[] arrQ2 = {2,12,88,76,34,55,9,5,23,78,999,34234,7664};
		System.out.println("Before select: " + Arrays.toString(arrQ2));
		System.out.println("1st order statistic: " + randomizedQuickselect(arrQ2, 0, arrQ2.length - 1, 1) + "\n");
		
		int[] arrQ3 = {789,879,64,1,68,7,9846,132,4879,5654,442};
		System.out.println("Before select: " + Arrays.toString(arrQ3));
		System.out.println("last order statistic: " + randomizedQuickselect(arrQ3, 0, arrQ3.length - 1, arrQ3.length) + "\n");
		
		int[] arrQ4 = {1,66,444,234,456,453,9976,546};
		System.out.println("Before select: " + Arrays.toString(arrQ4));
		System.out.println("5th order statistic: " + randomizedQuickselect(arrQ4, 0, arrQ4.length - 1, 5) + "\n");
		
		int[] arrQ5 = {456,32,32,76,54,87};
		System.out.println("Before select: " + Arrays.toString(arrQ4));
		System.out.println("2nd order statistic: " + randomizedQuickselect(arrQ4, 0, arrQ4.length - 1, 5) + "\n");
		//Counting Sort
		System.out.println("COUNTING SORT START");
		
		int[] arr = {0,2,1,3,3,3,2,1,4,3,2,3,1,1,2,3};//expected 1 zero, 4 one's, 4 two's, 6 three's, 1 four
		int[] sort = new int[arr.length];//output array to store sorted data
		System.out.println("Before sort: " + Arrays.toString(arr));
		countingSort(arr, sort, 4);
		System.out.println("After sort: " + Arrays.toString(sort) + "\n");
		
		int[] arr2 = {2,2,2,2,4,4,5,3,3,4,5,1,1,0,2,3,2};//expected 1 zero, 4 one's, 4 two's, 6 three's, 1 four
		int[] sort2 = new int[arr2.length];//output array to store sorted data
		System.out.println("Before sort: " + Arrays.toString(arr2));
		countingSort(arr2, sort2, 5);
		System.out.println("After sort: " + Arrays.toString(sort2) + "\n");
		
		
		int[] arr3 = {8,7,6,5,4,9,8,5,4,6,3,1,0};//expected 1 zero, 4 one's, 4 two's, 6 three's, 1 four
		int[] sort3 = new int[arr3.length];//output array to store sorted data
		System.out.println("Before sort: " + Arrays.toString(arr3));
		countingSort(arr3, sort3, 9);
		System.out.println("After sort: " + Arrays.toString(sort3) + "\n");
		
		int[] arr4 = {8,7,6,5,4,9,8,5,4,6,3,1,0};//expected 1 zero, 4 one's, 4 two's, 6 three's, 1 four
		int[] sort4 = new int[arr4.length];//output array to store sorted data
		System.out.println("Before sort: " + Arrays.toString(arr4));
		countingSort(arr4, sort4, 9);
		System.out.println("After sort: " + Arrays.toString(sort4) + "\n");
		
		
		int[] arr5 = {3,1,6,5,4,7,8,4,1};//expected 1 zero, 4 one's, 4 two's, 6 three's, 1 four
		int[] sort5 = new int[arr5.length];//output array to store sorted data
		System.out.println("Before sort: " + Arrays.toString(arr5));
		countingSort(arr5, sort5, 8);
		System.out.println("After sort: " + Arrays.toString(sort5) + "\n");
		//End Counting Sort
	}

}
