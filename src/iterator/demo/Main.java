package iterator.demo;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("java编程思想"));
        bookShelf.appendBook(new Book("java设计模式"));
        bookShelf.appendBook(new Book("数据结构与算法"));
        bookShelf.appendBook(new Book("网络编程"));
        bookShelf.appendBook(new Book("java核心卷"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book next = (Book) iterator.next();
            System.out.println(next.getName());
        }

    }

    @Test
    public void test01() {
        Map map = new HashMap<String, String>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
//     EntrySet迭代器遍历
        Set set = map.entrySet();
        java.util.Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry next = (Map.Entry) iterator.next();
            System.out.println(next.getKey());
        }


    }
}
