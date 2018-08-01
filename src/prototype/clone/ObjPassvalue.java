package prototype.clone;

class PassObj {
    String str = "init value";
}

public class ObjPassvalue {

    public static void main(String[] args) {
        PassObj objA = new PassObj();
        PassObj objB = objA;

        objA.str = "changed in objA";
        System.out.println("Print objB.str value: " + objB.str);
    }
} 