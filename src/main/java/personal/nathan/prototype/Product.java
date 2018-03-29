package personal.nathan.prototype;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/3/29.
 */
public interface Product extends Cloneable {

    void use(String s);

    Product createClone();
}
