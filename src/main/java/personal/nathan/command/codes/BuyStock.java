package personal.nathan.command.codes;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/9/15.
 */
public class BuyStock implements Order{
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
