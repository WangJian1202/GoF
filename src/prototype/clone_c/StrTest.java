package prototype.clone_c;

/**
 * 执行substring()方法后,str1没有变化，返回一个新的String类型str2
 */
public class StrTest {

    public static void main(String[] args) {
        String str1 = "This is a test for immutable";
        String str2 = str1.substring(0, 8);
        System.out.println("print str1 : " + str1);
        System.out.println("print str2 : " + str2);
    }
}