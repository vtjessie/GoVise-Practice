/**
 * imported files
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author vtjessie
 */
public class CharAndString {
    /**
     * checks if the given character is alphabetical
     * @param a the given character
     * @return boolean of status
     */
    public static boolean checkAlpha(char a){
        return Character.isAlphabetic(a);
    }

    /**
     * checks how many times a certain character appears within the frame of the string
     * @param str the given string
     * @param c the character we are checking for
     * @return the amount of times it appears
     */
    public static int frequency(String str, char c){
        int rtn = 0;
        char[] chrArr = str.toCharArray();
        for(char x : chrArr)
            if(x == c) rtn++;
        return rtn;
    }

    /**
     * replaces all the white space in a string with nothing
     * @param str the given string
     * @return the modified string
     */
    public static String replaceWhiteSpace(String str){
        String toReplace = str;
        for (int i = 0; i < toReplace.length(); i++)
            if(toReplace.substring(i, i + 1).equals(" ")) {
                toReplace = toReplace.substring(0, i) + toReplace.substring(i + 1);
                i--;
            }
        return toReplace;
    }

    /**
     * takes in a string in form DD/MM/YYYY and returns a Date object
     * @param str the given string
     * @return the string in Date representation
     */
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

    /**
     * returns a string representation of a character
     * @param c the given character
     * @return the equivalent string
     */
    public static String charToString(char c){
        return Character.toString(c);
    }

    /**
     * returns a character representation of a string
     * @param s the given string
     * @return the equivalent character
     */
    public static char[] stringToChar(String s){
        return s.toCharArray();
    }

    /**
     * checks if a string is empty, null or contains something
     * @param str the given string
     * @return the status of the string
     */
    public static String checkStringStatus(String str){
        if(str==null)
            return "String is null";
        if(str.equals(""))
            return "String is empty";
        return "String contains something";
    }

    /**
     * compares two strings
     * @param str1 string 1
     * @param str2 string 2
     * @return the difference in int form
     */
    public static int compareString(String str1, String str2){
        return str1.compareTo(str2);
    }

    /**
     * checks if a string is numeric
     * @param str the given string
     * @return boolean of the answer
     */
    public static boolean isNumeric (String str) {
        try {
            Double num = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    /**
     * gives the reverse of the string
     * @param str the given string
     * @return the reverse of str
     */
    public static String reverseString(String str){
        String rtnStr = "";
        for(int i = str.length(); i > 0; i++)
            rtnStr += str.substring(i - 1, i);
        return rtnStr;
    }

    /**
     * finds and prints all the duplicates in a given string
     * @param str the given string
     */
    public static void findAllDuplicates(String str){
        for(int i = 0; i < str.length(); i++)
            if(str.substring(i+1, str.length()).contains(str.substring(i, i+1)))
                System.out.println("there is an " + str.substring(i, i+1) + "duplicate");
    }

    /**
     * checks for string palindromes
     * @param str the given string
     * @return if it is a palidrome or not
     */
    public static boolean checkPalindrome(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    /**
     * Integer to String
     * @param i given integer
     * @return a string representation of the integer
     */
    public static String intToString(int i){
        return ""+i;
    }

    /**
     * String to integer
     * @param str given string
     * @return the integer representation of the string
     */
    public static int stringToInt(String str){
        return Integer.parseInt(str);
    }

    /**
     * splits the given string to 0 - 10 then prints 0-4 then 5-9
     * @param str the given string
     */
    public static void splitySplit(String str){
        String sub10 = str.substring(0,10);
        System.out.println(sub10.substring(0, 5));
        System.out.println(sub10.substring(5, 10));
    }

    /**
     * gets the user input through scanner
     * @return the users input
     */
    public static String getUserInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
