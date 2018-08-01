package template_method.demo;

public class CharDisplay extends AbstractDisplay {
    private  Character aChar;

    public CharDisplay(Character aChar) {
        this.aChar = aChar;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }
    @Override
    public void print() {
        System.out.print(aChar);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
