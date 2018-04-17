package personal.nathan.command.codes;

import java.util.ArrayList;
import java.util.List;

/**
 * 经纪人、中间人
 * <p>
 * Created by zhangwei on 2017/9/15.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
