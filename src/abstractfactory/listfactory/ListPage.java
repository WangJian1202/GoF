package abstractfactory.listfactory;

import abstractfactory.factory.Item;
import abstractfactory.factory.Page;

import java.util.Iterator;

public class ListPage extends Page {

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>"+title+"</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>"+title+"</h1>\n");
        buffer.append("<ul>\n");
        Iterator iterator = content.iterator();
        while(iterator.hasNext()){
            Item next = (Item)iterator.next();
            buffer.append(next.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>"+author+"</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }

    public ListPage(String title, String author) {
        super(title, author);
    }
}
