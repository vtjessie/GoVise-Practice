import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
}
