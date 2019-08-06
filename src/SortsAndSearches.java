/**
 * @author vtjessie
 */
public class SortsAndSearches {
    /**
     * bubble sort ascending
     * @param arr the given array
     */
    public static void bubbleAscending(int[] arr){
        for(int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if(arr[j] > arr[j+1]) {
                    int c = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = c;
                }
    }

    /**
     * bubble sort descending
     * @param arr the given array
     */
    public static void bubbleDecending(int[] arr){
        for(int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if(arr[j] < arr[j+1]) {
                    int c = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = c;
                }
    }

    /**
     * a linear search function
     * @param arr the given array
     * @param x what they need to find
     * @return index of the item
     */
    public static int linearSearch(int[] arr, int x){
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == x)
                return i;
        return -1;
    }

    /**
     * a binary search function
     * @param a given array
     * @param target what we trying to find
     * @return the index
     */
    public static int binarySearch(int[] a, int target){
        return binarySearch(a, target, 0, a.length -1);
    }

    /**
     * recursive helper
     * @param a
     * @param target
     * @param start
     * @param end
     * @return
     */
    private static int binarySearch(int[] a, int target, int start, int end){
        int mid = (start + end)/2;
        if(a[mid] == target) return mid;
        if(a[mid] > target) return binarySearch(a, target, start, mid - 1);
        return binarySearch(a, target, mid + 1, end);
    }

    /**
     * quick sort
     * @param arr the given array
     * @param start starting of array
     * @param end ending of array
     */
    public static void quickSort(int[] arr, int start, int end){
        int quicksort = quicksort(arr, start, end);
        if(quicksort-1>start)
            quickSort(arr, start, quicksort - 1);
        if(quicksort+1<end)
            quickSort(arr, quicksort + 1, end);
    }

    /**
     * recursive helper
     * @param arr
     * @param start
     * @param end
     * @return
     */
    private static int quicksort(int[] arr, int start, int end){
        int pivot = arr[end];
        for(int i=start; i<end; i++){
            if(arr[i]<pivot){
                int temp= arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
            }
        }
        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;
        return start;
    }
}
