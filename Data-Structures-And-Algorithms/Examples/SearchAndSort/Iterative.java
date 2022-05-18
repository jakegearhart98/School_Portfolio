import java.util.Random;

public class Iterative {
  
  public static int seqSearch(int[] arr, int target) {

    for (int i=0; i<arr.length; i++)
      if (arr[i] == target)
        return i;

    return -1;
  }

  public static void selSort(int[] arr) {

    int smallj, temp;

    for (int i=0; i<arr.length-1; i++) {
      smallj = i;
      for (int j=i+1; j<arr.length; j++) {
        if (arr[j] < arr[smallj])
          smallj = j;
      }
      temp = arr[smallj];
      arr[smallj] = arr[i];
      arr[i] = temp;
    }
  }

  public static void insertSort(int[] arr) {

    int j, temp;

    for (int i=1; i<arr.length; i++) {
      j = i;
      temp = arr[j];
      while (j != 0 && temp < arr[j-1]) {
        arr[j] = arr[j-1];
        j--;
      }
      arr[j] = temp;
    }
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

    for (int i=0; i<10; i++)
      System.out.println(seqSearch(a1, a1[i]));
    System.out.println(seqSearch(a1, -2000));
    System.out.println(seqSearch(a1, 2000));

  }

}