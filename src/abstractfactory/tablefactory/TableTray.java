package abstractfactory.tablefactory;

import abstractfactory.factory.Item;
import abstractfactory.factory.Tray;

import java.util.Iterator;

public class TableTray extends Tray {

    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<td>");
        buffer.append("<table width=\"100%\" border=\"1\"><tr>");
        buffer.append("<td bgcolor=\"#cccccc\" align=\"centre\" colspan=\""+tray.size()+"\"><b>"+caption+"</b></td>");
        buffer.append("</tr>\n");
        buffer.append("<tr>\n");
        Iterator iterator = tray.iterator();
        while (iterator.hasNext()){
            Item next = (Item)iterator.next();
            buffer.append(next.makeHTML());
        }
        buffer.append("</tr></table>");
        buffer.append("</td>");
        return buffer.toString();
    }
}
