public class SortsAndSearches {
    public static void bubbleAscending(int[] arr){
        for(int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if(arr[j] > arr[j+1]) ManipulateNumbers.swapTwoInteger(arr[j+1], arr[j]);
    }
    public static void bubbleDecending(int[] arr){
        for(int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if(arr[j] < arr[j+1]) ManipulateNumbers.swapTwoInteger(arr[j+1], arr[j]);
    }
    public static int linearSearch(int[] arr, int x){
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == x)
                return i;
        return -1;
    }
    public static int binarySearch(int[] a, int target){
        return binarySearch(a, target, 0, a.length -1);
    }
    public static int binarySearch(int[] a, int target, int start, int end){
        int mid = (start + end)/2;
        if(a[mid] == target) return mid;
        if(a[mid] > target) return binarySearch(a, target, start, mid - 1);
        return binarySearch(a, target, mid + 1, end);
    }
    public static void quickSort(int[] arr, int start, int end){
        int quicksort = quicksort(arr, start, end);
        if(quicksort-1>start)
            quickSort(arr, start, quicksort - 1);
        if(quicksort+1<end)
            quickSort(arr, quicksort + 1, end);
    }
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
