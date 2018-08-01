package prototype.proto;

import java.util.HashMap;
import java.util.Map;

public class Manager {

    private Map showcase = new HashMap<String,String>();

    public void register(String name,Product product){
        showcase.put(name,product);
    }
    public Product create(String name){
        Product  p =(Product) showcase.get(name);
        return p;
    }
}
