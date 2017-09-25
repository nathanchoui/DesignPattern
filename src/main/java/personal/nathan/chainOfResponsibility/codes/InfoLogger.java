package personal.nathan.chainOfResponsibility.codes;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/9/24.
 */
public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("info logger:" + message);
    }
}
