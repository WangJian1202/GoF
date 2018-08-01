package template_method.demo;

public class Main {

    public static void main(String[] args) {
        CharDisplay c = new CharDisplay('c');
        StringDisplay d=new StringDisplay("HelloWorld");
        c.display();
        d.display();
    }

}
