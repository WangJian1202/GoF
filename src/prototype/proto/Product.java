package prototype.proto;

public interface Product {
    public abstract void use(String s);
    public abstract Product createClone();
}
