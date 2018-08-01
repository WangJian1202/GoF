package builder.demo01;

public abstract class Builder {
    protected int count=0;
    public abstract void makeTile(String title);
    public abstract void makeString(String str);
    public abstract void makeItem(String[] items);
    public abstract void close();

}
