public class B extends A{
    public B(int x){
        super(x);
    }

    @Override
    public String toString() {
        return "This is the " + getX() + " B";
    }
}
