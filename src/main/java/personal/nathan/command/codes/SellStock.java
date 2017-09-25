package personal.nathan.command.codes;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/9/15.
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
