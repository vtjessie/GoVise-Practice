/**
 * @author vtjessie
 *
 */
public class A implements C, D{
    /**
     * instance field
     */
    private int x;
    private boolean adminCreated = false;

    /**
     * private constructor for in class use
     * @param x random key val
     * @param adminCreated only for in class use
     */
    private A(int x, boolean adminCreated){
        this.x = x;
        this.adminCreated = adminCreated;
    }

    /**
     * constructor
     * @param x random key val
     */
    public A(int x){
        this.x = x;
    }

    /**
     * getter for X
     * @return val of x
     */
    public int getX() {
        return x;
    }

    /**
     * setter for x
     * @param x enter new x val
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * toString
     * @return string rep of this obj
     */
    @Override
    public String toString() {
        return "This is the " + x + " A";
    }

    /**
     * adds one to x
     */
    @Override
    public void addOne() {
        x++;
    }

    /**
     * subtracts one to x
     */
    @Override
    public void subtractOne() {
        x--;
    }
}
