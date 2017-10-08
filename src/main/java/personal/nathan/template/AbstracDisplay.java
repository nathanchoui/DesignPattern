package personal.nathan.template;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/10/8.
 */
public abstract class AbstracDisplay {

    protected abstract void open();

    protected abstract void print();

    protected abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i ++) {
            print();
        }
        close();
    }

}
