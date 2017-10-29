package personal.nathan.factory.IDCard;

import personal.nathan.factory.framework.Factory;
import personal.nathan.factory.framework.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/10/15.
 */
public class IDCardFactory extends Factory {

    private List<Product> owners = new ArrayList<Product>();

    private static AtomicLong seqNo = new AtomicLong(0);

    @Override
    protected Product createProduct(String owner) {
        seqNo.getAndIncrement();
        return new IDCard(seqNo.longValue(), owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(product);
    }

    public List<Product> getOwners() {
        return owners;
    }
}
