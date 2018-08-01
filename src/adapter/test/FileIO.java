package adapter.test;

import java.io.IOException;

public interface FileIO {
    public abstract void readFromFile(String filename) throws IOException;
    public abstract void writeToFile(String filename)  throws IOException;
    public void setValue(String key,String value);
    public String getValue(String key);
}
