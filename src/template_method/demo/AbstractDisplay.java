package template_method.demo;

public  abstract class AbstractDisplay {
    /* no-
        接口中不能定义具体实现的方法，因此template method模式中不能用接口

    op */

//    将public改为protect则抽象方法不能被其他类调用
    public abstract void open();
    public abstract void  print();
    public abstract void close();
    //这里方法被final修饰，表示方法不能够被子类重写
    public /*final*/ void display(){
        open();
        for (int i = 0; i <5 ; i++) {
            print();
        }
        close();
    }
}
