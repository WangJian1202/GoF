package prototype.clone;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * 向Hashtable传递 StringBuffer对象也是只传递了这个StringBuffer对象的引用！
 * 每一次向Hashtable表中put一次 StringBuffer，并没有生成新的StringBuffer对象，
 * 只是在Hashtable表中又放入了一个指向同一StringBuffer对 象的引用而已。
 */
public class HashtableAdd {

    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        StringBuffer sb = new StringBuffer();
        sb.append("abc,");
        ht.put("1", sb);
        sb.append("def,");
        ht.put("2", sb);
        sb.append("mno,");
        ht.put("3", sb);
        sb.append("xyz.");
        ht.put("4", sb);
        int numObj = 0;
        Enumeration it = ht.elements();
        while (it.hasMoreElements()) {
            System.out.print("get StringBufffer " + (++numObj) + " from Hashtable: ");
            System.out.println(it.nextElement());
        }
    }


} 