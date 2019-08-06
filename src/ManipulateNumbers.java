/**
 * @author vtjessie
 */
public class ManipulateNumbers {
    /**
     * adds two numbers
     * @param x x var
     * @param y y var
     * @return the sum
     */
    public static int addTwoIntegers(int x, int y){
        return x + y;
    }

    /**
     * swap two integers
     * @param x x var
     * @param y y var
     */
    public static void swapTwoInteger(int x, int y){
        System.out.println("Given:"+"\n"+"x: " + x + "\n" + "y: " + y);
        int c = y;
        y = x;
        x = c;
        System.out.println("Manipulated:"+"\n"+"x: " + x + "\n" + "y: " + y);
    }

    /**
     * checks if a given number is even or odd
     * @param a the given number
     * @return the result
     */
    public static String evenOrOdd(int a){
        return a%2==0?"even":"odd";
    }

    /**
     * returns the largest number within the three numbers
     * @param x x var
     * @param y y var
     * @param z z var
     * @return the largest var
     */
    public static int largest(int x, int y, int z){
        if(x >= y && x >= z)
            return x;
        if(y >= x && y >= z)
            return y;
        return z;
    }

    /**
     * gives a random integer in range [0, 9]
     * @return random int
     */
    public static int rand(){
        return (int)(Math.random()*10);
    }

    /**
     * gives a random number in the rand [0, 10^todecimal)
     * @param toDecimal to which decimal
     * @return the random number
     */
    public static double rand(int toDecimal){
        if(toDecimal >= 0 && toDecimal < 28) {
            double multiplier = Math.pow(10, toDecimal);
            return (int)(Math.random()*toDecimal);
        }
        return -1;
    }
}
