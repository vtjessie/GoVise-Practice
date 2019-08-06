/**
 * @author vtjessie
 */
public class StringInteger {
    /**
     * instance field
     */
    Integer val;
    String str;
    boolean type;

    /**
     * constructor
     * @param x the val of int
     */
    public StringInteger(int x){
        val = x;
        type = true;
    }

    /**
     * constructor
     * @param str the val of string
     */
    public StringInteger(String str){
        this.str = str;
        type = false;
    }

    /**
     * @return the type of the obj
     */
    public String getType(){
        return type?"Integer":"String";
    }

    /**
     * @return the value of the obj
     */
    public Object getValue(){
        return val!=null?val:str;
    }
}
