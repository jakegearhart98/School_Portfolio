import java.util.Random;

public class Recursive {
  
  public static int seqSearch(int[] arr, int target) {
    return seqSearch(arr, target, 0);
  }

  private static int seqSearch(int[] arr, int target, int index) {
    if (index >= arr.length) return -1;
    if (arr[index] == target) return index;
    return seqSearch(arr, target, index+1);
  }

  public static int binarySearch(int[] arr, int target) {
    return binarySearch(arr, target, 0, arr.length-1);
  }

  private static int binarySearch(int[] arr, int target, int start, int end) {

    if (start > end) return -1;
    int mid = (start + end) / 2;
    if (arr[mid] == target) return mid;
    if (arr[mid] > target)
      return binarySearch(arr, target, start, mid-1);
    return binarySearch(arr, target, mid+1, end);
  }

  public static void selSort(int[] arr) {
    selSort(arr, 0);
  }

  private static void selSort(int[] arr, int i) {
    if (i < arr.length - 1) {
      int smallj = smallestIndex(arr, i, arr.length-1);
      int temp = arr[i];
      arr[i] = arr[smallj];
      arr[smallj] = temp;
      selSort(arr, i+1);
    }
  }

  public static int smallestIndex(int[] arr) {
    return smallestIndex(arr, 1, 0);
  }

  private static int smallestIndex(int[] arr, int curr, int small) {
    if (curr >= arr.length) return small;
    int smaller = (arr[curr] < arr[small]) ? curr : small;
    return smallestIndex(arr, curr+1, smaller);
  }

  public static void insertSort(int[] arr) {
    insertSort(arr, 0);
  }

  private static void insertSort(int[] arr, int i) {
    if (i < arr.length) {
      insert(arr, i);
      insertSort(arr, i+1);
    }
  }

  public static void insert(int[] arr, int j) {
    if (j == 0) return;
    if (arr[j] < arr[j-1]) {
      int temp = arr[j];
      arr[j] = arr[j-1];
      arr[j-1] = temp;
      insert(arr, j-1);
    }

  }

  public static void mergeSort(int[] arr) {
    int [] tempArr = mergeSplit(arr, 0, arr.length-1);
    for (int i=0; i<arr.length; i++)
      arr[i] = tempArr[i];
  }

    private static int[] mergeSplit(int[] arr, int start, int end) {
         int[] mergedArr = new int[2];
         if (start < end) {
            mergedArr = merge(mergeSplit(arr, start, (start+end)/2),
                                mergeSplit(arr, (start+end)/2 + 1, end));
         }
         else if (start == end) {
            mergedArr[0] = arr[start];
            mergedArr[1] = Integer.MAX_VALUE;
         }
         return mergedArr;
    }
    
    private static int[] merge(int[] left, int[] right) {
        int[] tempArr = new int[left.length + right.length - 1];
        int index = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        
        while (index < tempArr.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                tempArr[index] = left[leftIndex];
                leftIndex++;
            }
            else {
                tempArr[index] = right[rightIndex];
                rightIndex++;
            }
            index++;
        }
        return tempArr;
    }

  public static void quickSort(int[] arr) {
    quickSort(arr, 0, arr.length-1);
  }

  public static void quickSort(int[] arr, int start, int end) {
    if (start < end) {
      int split = partition(arr, start, end);
      quickSort(arr, start, split-1);
      quickSort(arr, split+1, end);
    }
  }

  private static int partition(int[] arr, int start, int end) {
    int oldStart, temp;
    int pivot = arr[start];
    oldStart = start;

    while (start < end) {
      while (start < end && arr[start] <= pivot) start++;
      while (end >= start && arr[end] > pivot) end--;
      if (start < end) {
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
      }
    }
    arr[oldStart] = arr[end];
    arr[end] = pivot;

    return end;
  }

  public static int[] genArray(Random gen, int size) {

    int [] arr = new int[size];

    for (int i=0; i<size; i++) 
      arr[i] = gen.nextInt(1000);

    return arr;
  }

  public static void printArray(int[] arr) {
    for (int i=0; i<arr.length; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
  }

  public static void main(String [] args) {

    Random gen = new Random();
    int [] a1;

    a1 = genArray(gen, 10);
    printArray(a1);
    selSort(a1);
    printArray(a1);
    System.out.println();

    a1 = genArray(gen, 10);
    printArray(a1);
    insertSort(a1);
    printArray(a1);
    System.out.println();

    a1 = genArray(gen, 10);
    printArray(a1);
    mergeSort(a1);
    printArray(a1);
    System.out.println();

    a1 = genArray(gen, 10);
    printArray(a1);
    quickSort(a1);
    printArray(a1);
    System.out.println();

    for (int i=0; i<10; i++)
      System.out.println(seqSearch(a1, a1[i]));
    System.out.println(seqSearch(a1, -2000));
    System.out.println(seqSearch(a1, 2000));


  }

}