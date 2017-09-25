package personal.nathan.factory.abstractfactory;

import personal.nathan.factory.MobilePhone;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/9/3.
 */
public class TestAbstractFactory {

    public static void main(String[] args) {
        MobilePhone iphone = new IPhoneFactory().produce();
        iphone.makeACall();
    }
}
