package factory.idcard;

import factory.framework.Factory;
import factory.framework.Product;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class IDCradFactory extends Factory  {

    private List owners=new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
