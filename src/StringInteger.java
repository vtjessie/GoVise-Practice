public class StringInteger {
    Integer val;
    String str;
    boolean type;
    public StringInteger(int x){
        val = x;
        type = true;
    }
    public StringInteger(String str){
        this.str = str;
        type = false;
    }
    public String getType(){
        return type?"Integer":"String";
    }
    public Object getValue(){
        return val!=null?val:str;
    }
}
