package prototype.proto;

public class Main {

    public static void main(String[] args) {
        //准备
        Manager manager=new Manager();
        UnderlinePen up=new UnderlinePen('~');
        MessageBox mbox=new MessageBox('*');
        MessageBox sbox=new MessageBox('/');
        manager.register("strong message",up);
        manager.register("warning box",mbox);
        manager.register("slash box",sbox);
//        生成
        Product strong_message = manager.create("strong message");
        strong_message.use("HelloWorld");
        Product warning_box = manager.create("warning box");
        warning_box.use("HelloWorld");
        Product slash_box = manager.create("slash box");
        slash_box.use("HelloWorld");
    }
}
