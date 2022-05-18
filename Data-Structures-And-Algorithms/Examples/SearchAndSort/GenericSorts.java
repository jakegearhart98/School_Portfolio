import java.util.Random;

/**
* @author Charley Sheaffer
* @version 4/10/2019
*/

public class GenericSorts {

    public static <T extends Comparable<T>> int sequentialSearch(T[] array, T target) {
        for (int i=0; i<array.length; i++)
            if (array[i].equals(target))
                return i;
        return -1;
    }

    public static <T extends Comparable<T>> 
                int binarySearch(T[] array, T target) {
        return binarySearch(array, target, 0, array.length-1);
    }

    public static <T extends Comparable<T>> 
                int binarySearch(T[] array, T target, int start, int end) {    
        if (end < start) return -1;
        int mid = (start + end) / 2;
        if (array[mid].equals(target)) return mid;
        if (array[mid].compareTo(target) < 0)
            return binarySearch(array, target, mid+1, end);
        return binarySearch(array, target, start, mid-1);
    }
    
    public static <T extends Comparable<T>> void selectionSort(T[] array) {
        T temp;
        int largestLoc;
        for (int i=array.length-1; i>0; i--) {
            largestLoc = 0;
            for (int j=1; j<=i; j++) {
                if (array[j].compareTo(array[largestLoc]) > 0)
                    largestLoc = j;
            }
            temp = array[i];
            array[i] = array[largestLoc];
            array[largestLoc] = temp;
        }
    }
       
    public static <T extends Comparable<T>> void insertionSort(T[] array) {
        for (int i=1; i<array.length; i++) {
            T current = array[i];
            int j=i-1;
            while (j >= 0 && current.compareTo(array[j]) < 0) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }
       
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        T temp;
        int lastSwap;
        int end = array.length - 1;
        while (end > 1) {
            lastSwap = 0;
            for (int j=0; j<end; j++) {
                if (array[j].compareTo(array[j+1]) > 0) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    lastSwap = j + 1;
                }
            }
            end = lastSwap;
        }
    }
    
    public static <T extends Comparable<T>> void mergeSort(T[] array) {
        mergeSort(array, 0, array.length-1);
    }
    
    private static <T extends Comparable<T>> 
               void mergeSort(T[] array, int start, int end) {
        int mid = 0;
        if (start < end) {
            mid = (start+end)/2;
            mergeSort(array, start, mid);
            mergeSort(array, mid+1, end);
            merge(array, start, mid, end);
        }
    }
    
    private static <T extends Comparable<T>> 
               void merge(T[] array, int start, int mid, int end) {
        @SuppressWarnings("unchecked")
        T[] tempArray = (T[]) new Comparable[array.length];
        int first1 = start;
        int last1 = mid;
        int first2 = mid + 1;
        int last2 = end;
        int index = start;
        
        while (first1 <= last1 && first2 <= last2) {
            if (array[first1].compareTo(array[first2]) <= 0){
                tempArray[index] = array[first1];
                first1++;
            }
            else {
                tempArray[index] = array[first2];
                first2++;
            }
            index++;
        }
        
        while (first1 <= last1) {
            tempArray[index] = array[first1];
            first1++;
            index++;
        }

        while (first2 <= last2) {
            tempArray[index] = array[first2];
            first2++;
            index++;
        }

        for (int i=start; i<=end; i++) {
            array[i] = tempArray[i];
        }
    }

    public static <T extends Comparable<T>> void quickSort(T[] array) {
        quickSort(array, 0, array.length-1);
    }
    
    private static <T extends Comparable<T>>  
                     void quickSort(T[] array, int start, int end) {
        if (start < end) {
            int split = partition(array, start, end);
            quickSort(array, start, split-1);
            quickSort(array, split+1, end);
        }
    }
    
    private static <T extends Comparable<T>> 
                   int partition(T[] array, int start, int end) {
        T temp;
        int originalStart = start;
        T pivot = array[start];
        while (start < end) {
            while (array[start].compareTo(pivot) <= 0 && start < end) start++;
            while (array[end].compareTo(pivot) > 0 && start <= end) end--;
            if (start < end) {
                temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
        }
        temp = array[originalStart];
        array[originalStart] = array[end];
        array[end] = temp;
        return end;
    }

  public static void main(String [] args) {
    Movie [] movies = new Movie[5];
    movies[0] = new Movie("Casablanca", "Michael Curtiz", 1942, 102);
    movies[1] = new Movie("Vertigo", "Alfred Hitchcock", 1958, 128);
    movies[2] = new Movie("Sleuth", "Joseph Mankiewicz", 1972, 138);
    movies[3] = new Movie("Metropolis", "Fritz Lang", 1927, 153);
    movies[4] = new Movie("Sleuth", "Kenneth Branagh", 2007, 88);

    GenericSorts.insertionSort(movies);
    for (Movie m : movies) System.out.println(m);

    int index = GenericSorts.binarySearch(movies, new Movie("Sleuth", "Joseph Mankiewicz", 1972, 138));
    System.out.println("Sleuth is at index " + index);

  }

    
}