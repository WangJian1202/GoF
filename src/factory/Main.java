package factory;

import factory.framework.Factory;
import factory.framework.Product;
import factory.idcard.IDCard;
import factory.idcard.IDCradFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory=new IDCradFactory();
        Product S = factory.create("孙红雷");
        System.out.println("-----------------------");
        Product H = factory.create("黄渤");
        System.out.println("-----------------------");
        Product W = factory.create("王宝强");
        System.out.println("-----------------------");
        S.use();
        System.out.println("-----------------------");
        H.use();
        System.out.println("-----------------------");
        W.use();
    }

}
