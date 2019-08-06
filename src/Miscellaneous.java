import java.io.IOError;
import java.io.IOException;

public class Miscellaneous {
    public static void arithmeticException(){
        try {
            //bad math
            int i = 0/0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
    public static void randomContBreak(){
        for (int i = 0; i < 100; i++) {
            if (i * 10 == 50)
                break; // terminate loop if i is 5
            System.out.println("i: " + i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0)
                continue;
            System.out.println();
        }
    }
    public static void randomInstanceOf(){
        System.out.println("x" instanceof String);
    }
    public static void tryAndFinally() throws ArithmeticException {
        int i;
        try {
            i = 0/0;
        } finally {
            i = 0;
        }
    }
    public static void checkEquals(String str1, String str2, String str3){
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str3));
        System.out.println(str2 == str3);
    }
}
