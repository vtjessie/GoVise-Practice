import java.util.*;

/**
 * @author vtjessie
 */
public class DataStructureFunctions{
    /**
     * find the average of the numbers in a given array
     * @param arr the given array
     * @return the average
     */
    public static double arrayAverage(int[] arr){
        int sum = 0;
        for(int val : arr)
            sum += val;
        return (double)sum/arr.length;
    }

    /**
     * gives the largest number in an array
     * @param arr the given array
     * @return the largest number
     */
    public static int largestInAnArray(int[] arr){
        int largest = arr[0];
        for(int i = 1; i < arr.length; i++)
            if(largest < arr[i]) largest = arr[i];
        return largest;
    }

    /**
     * prints the array in [...] form
     * @param arr the given array
     */
    public static void printArr(int[] arr){
        String toPrint = "[";
        for(int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1)
                toPrint += arr[i] + ", ";
            else
                toPrint += arr[i];
        }
        toPrint += "]";
        System.out.println(toPrint);
    }

    /**
     * add two arrays together
     * @param arr1 the first array
     * @param arr2 the second array
     * @return the combined array
     */
    public static int[] addArrays(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++)
            arr[i] = arr1[i];
        for(int i = 0; i < arr2.length; i++)
            arr[i+arr1.length] = arr2[i];
        return arr;
    }

    /**
     * turns the values in a maps to the list
     * @param map the given map
     * @return the value list
     */
    public static <T> List mapToList(Map<Integer ,T> map){
        return new ArrayList<>(map.values());
    }
    /**
     * turn an array into a Set
     * @param arr given Array
     * @param <T> given array type
     * @return the set
     */
    public static <T> Set<T> arrayToSet(T arr[]) {
        return new HashSet<>(Arrays.asList(arr));
    }

    /**
     * turn a set into an array
     * @param set the given set
     * @param <T> the given set type
     * @return the array
     */
    public static <T> T setToArray(Set<T> set){
        return (T)set.toArray();
    }

    /**
     * sorting a map by the values in it
     * @param map the given map
     * @param <K> the given key type
     * @param <V> the given value type
     * @return the sorted map
     */
    public static <K, V extends Comparable<? super V>> Map<K, V> sortMapByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list)
            result.put(entry.getKey(), entry.getValue());
        return result;
    }
}
