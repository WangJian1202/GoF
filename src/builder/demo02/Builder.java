package builder.demo02;

public interface Builder {
    public abstract void makeTile(String title);
    public abstract void makeString(String str);
    public abstract void makeItem(String[] items);
    public abstract void close();
}
