public class Main {
    public static void main(String[] args) {
        MutableObject mutableObject = new MutableObject("mutable object");
        System.out.println(mutableObject.getObjName());
        mutableObject.setObjName("mutable object 1");
        System.out.println(mutableObject.getObjName());
        ImmutableObject immutableObject = new ImmutableObject("immutable object");
        System.out.println(immutableObject.getObjName());
    }
}

class MutableObject {
    private String objName;

    MutableObject(String objName){
        this.objName = objName;
    }

    public String getObjName(){
        return this.objName;
    }

    public void setObjName (String objName){
        this.objName = objName;
    }
}

final class ImmutableObject {
    private final String objName;

    ImmutableObject(final String objName){
        this.objName = objName;
    }

    public String getObjName(){
        return this.objName;
    }

}