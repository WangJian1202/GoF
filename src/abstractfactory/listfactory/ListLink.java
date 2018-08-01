package abstractfactory.listfactory;

import abstractfactory.factory.Link;

public class ListLink extends Link {
    @Override
    public String makeHTML() {
        return "<li><a href=\""+url+"\">"+caption+"</a></li>\n";
    }

    public ListLink(String caption, String url) {
        super(caption, url);
    }
}
