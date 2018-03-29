package personal.nathan.prototype;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/3/29.
 */
public abstract class AbstractProduct implements Product {

    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
