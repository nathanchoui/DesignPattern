package personal.nathan.factory.common.factory;

import personal.nathan.factory.MobilePhone;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/9/3.
 */
public class TestCommonFacotry {

    public static void main(String[] args) {
        MobilePhone phone = CommonFactory.produceIPhone();
        phone.makeACall();
    }
}
