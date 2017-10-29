package personal.nathan.factory.IDCard;

import personal.nathan.factory.framework.Factory;
import personal.nathan.factory.framework.Product;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/10/15.
 */
public class Main {

    public static void main(String[] args) {
        Factory idcardFactory = new IDCardFactory();
        Product ming = idcardFactory.create("xiao ming");
        Product hong = idcardFactory.create("xiao hong");
        Product gang = idcardFactory.create("xiao gang");
        ming.use();
        hong.use();
        gang.use();
    }
}
