package personal.nathan.factory.common.factory;


import personal.nathan.factory.BlackBerryPhone;
import personal.nathan.factory.IPhone;
import personal.nathan.factory.MobilePhone;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/9/3.
 */
public class CommonFactory {

    public static MobilePhone produceIPhone() {
        return new IPhone();
    }

    public static MobilePhone produceBlackBerryPhone() {
        return new BlackBerryPhone();
    }
}
