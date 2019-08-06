/**
 * @author vtjessie
 */
public class Miscellaneous {
    /**
     * example of arithmetic exception
     */
    public static void arithmeticException(){
        try {
            //bad math
            int i = 0/0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    /**
     * example of continue and break
     */
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

    /**
     * instanceof example
     */
    public static void randomInstanceOf(){
        System.out.println("x" instanceof String);
    }

    /**
     * example of try and finally
     * @throws ArithmeticException
     */
    public static void tryAndFinally() throws ArithmeticException {
        int i;
        try {
            i = 0/0;
        } finally {
            i = 0;
        }
    }

    /**
     * example of equates
     * @param str1
     * @param str2
     * @param str3
     */
    public static void checkEquals(String str1, String str2, String str3){
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str3));
        System.out.println(str2 == str3);
    }
}
