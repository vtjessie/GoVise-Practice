public class ManipulateNumbers {
    public static int addTwoIntegers(int x, int y){
        return x + y;
    }
    public static void swapTwoInteger(int x, int y){
        System.out.println("Given:"+"\n"+"x: " + x + "\n" + "y: " + y);
        int c = y;
        y = x;
        x = c;
        System.out.println("Manipulated:"+"\n"+"x: " + x + "\n" + "y: " + y);
    }
    public static String evenOrOdd(int a){
        return a%2==0?"even":"odd";
    }
    public static int largest(int x, int y, int z){
        if(x >= y && x >= z)
            return x;
        if(y >= x && y >= z)
            return y;
        return z;
    }
    public static int rand(){
        return (int)(Math.random()*10);
    }
    public static double rand(int toDecimal){
        if(toDecimal >= 0 && toDecimal < 28) {
            double multiplier = Math.pow(10, toDecimal);
            return (int)(Math.random()*toDecimal);
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println(largest(1,2,3));
    }
}
