public class A implements C, D{
    private int x;
    private boolean adminCreated = false;
    private A(int x, boolean adminCreated){
        this.x = x;
        this.adminCreated = adminCreated;
    }
    public A(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "This is the " + x + " A";
    }

    @Override
    public void addOne() {
        x++;
    }

    @Override
    public void subtractOne() {
        x--;
    }
}
