package personal.nathan.factory.abstractfactory;


import personal.nathan.factory.IPhone;
import personal.nathan.factory.MobilePhone;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/9/3.
 */
public class IPhoneFactory implements AbstractFactory {

    public MobilePhone produce() {
        return new IPhone();
    }
}
