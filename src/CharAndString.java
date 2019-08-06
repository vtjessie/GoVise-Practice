import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CharAndString {
    public static boolean checkAlpha(char a){
        return Character.isAlphabetic(a);
    }
    public static int frequency(String str, char c){
        int rtn = 0;
        char[] chrArr = str.toCharArray();
        for(char x : chrArr)
            if(x == c) rtn++;
        return rtn;
    }
    public static String replaceWhiteSpace(String str){
        String toReplace = str;
        for (int i = 0; i < toReplace.length(); i++)
            if(toReplace.substring(i, i + 1).equals(" ")) {
                toReplace = toReplace.substring(0, i) + toReplace.substring(i + 1);
                i--;
            }
        return toReplace;
    }
    public static Date stringToDate(String str){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
           date = formatter.parse(str);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    public static String charToString(char c){
        return Character.toString(c);
    }
    public static char[] stringToChar(String s){
        return s.toCharArray();
    }
    public static String checkStringStatus(String str){
        if(str==null)
            return "String is null";
        if(str.equals(""))
            return "String is empty";
        return "String contains something";
    }
    public static int compareString(String str1, String str2){
        return str1.compareTo(str2);
    }
    public static boolean isNumeric (String str) {
        try {
            Double num = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    public static String reverseString(String str){
        String rtnStr = "";
        for(int i = str.length(); i > 0; i++)
            rtnStr += str.substring(i - 1, i);
        return rtnStr;
    }
    public static void findAllDuplicates(String str){
        for(int i = 0; i < str.length(); i++)
            if(str.substring(i+1, str.length()).contains(str.substring(i, i+1)))
                System.out.println("there is an " + str.substring(i, i+1) + "duplicate");
    }
    public static boolean checkPalindrone(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    public static String intToString(int i){
        return ""+i;
    }
    public static int stringToInt(String str){
        return Integer.parseInt(str);
    }
    public static void splitySplit(String str){
        String sub10 = str.substring(0,10);
        System.out.println(sub10.substring(0, 5));
        System.out.println(sub10.substring(5, 10));
    }
    public static String getUserInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
