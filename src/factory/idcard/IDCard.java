package factory.idcard;

import factory.framework.Product;

public class IDCard extends Product {

    private String owner;
//    这里不用public保证外部类不能new IDCard对象
   /*public*/ IDCard(String owner) {
        System.out.println("制作"+owner+"的卡片");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用"+owner+"的卡片");
    }

    public String getOwner() {
        return owner;
    }
}
