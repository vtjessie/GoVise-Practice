/**
 * @author vtjessie
 */
public class B extends A{
    /**
     * constructor
     * @param x random key val
     */
    public B(int x){
        super(x);
    }

    /**
     * toString
     * @return string representation of obj
     */
    @Override
    public String toString() {
        return "This is the " + getX() + " B";
    }
}
