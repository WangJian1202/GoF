package abstractfactory.listfactory;

import abstractfactory.factory.Item;
import abstractfactory.factory.Tray;

import java.util.Iterator;

public class ListTray extends Tray {

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption+"\n");
        buffer.append("<ul>\n");
        Iterator iterator = tray.iterator();
        while(iterator.hasNext()){
            Item next =(Item)iterator.next();
            buffer.append(next.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }

    public ListTray(String caption) {
        super(caption);
    }
}
