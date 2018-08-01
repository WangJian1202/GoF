package adapter.test;

import java.io.*;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {


    @Override
    public void readFromFile(String filename) throws IOException{
    super.load(new FileInputStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        super.store(new FileOutputStream(filename),"written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key, "");
    }
}
