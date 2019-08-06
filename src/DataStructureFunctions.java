import java.util.*;

public class DataStructureFunctions{
    public static double arrayAverage(int[] arr){
        int sum = 0;
        for(int val : arr)
            sum += val;
        return (double)sum/arr.length;
    }
    public static int largestInAnArray(int[] arr){
        int largest = arr[0];
        for(int i = 1; i < arr.length; i++)
            if(largest < arr[i]) largest = arr[i];
        return largest;
    }
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
    public static int[] addArrays(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++)
            arr[i] = arr1[i];
        for(int i = 0; i < arr2.length; i++)
            arr[i+arr1.length] = arr2[i];
        return arr;
    }
    public static List mapToList(Map<Integer ,Integer> map){
        return new ArrayList<>(map.values());
    }
    public static <T> Set<T> arrayToSet(T arr[]) {
        return new HashSet<>(Arrays.asList(arr));
    }
    public static <T> T setToArray(Set<T> set){
        return (T)set.toArray();
    }
    public static <K, V extends Comparable<? super V>> Map<K, V> sortMapByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list)
            result.put(entry.getKey(), entry.getValue());
        return result;
    }
}
