package personal.nathan.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/3/29.
 */
public class Manager {

    private Map<String, Product> showcase = new HashMap<String, Product>();

    public void register(String name, Product product) {
        this.showcase.put(name, product);
    }

    public Product create(String protoname) {
        return showcase.get(protoname).createClone();
    }
}
