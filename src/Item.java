/**
 * Created by Danny on 5/10/2017.
 */
public class Item {
    private String name;
    private enum Type{S,C,I,D,B,F,Sd,Cd,Id,Dd,Bd,Fd,L}
    /*
    * S-String
    * C-char
    * I-int
    * D-Double
    * B-Boolean
    * F-function
    *
    * d-means declaration
    * L-means loop
    *
    * */
    private Type type;

    Item(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public Type getType(){
        return this.type;
    }

    public void setType(Type type){
        this.type=type;
    }

}
