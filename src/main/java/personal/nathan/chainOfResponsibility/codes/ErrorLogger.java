package personal.nathan.chainOfResponsibility.codes;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/9/24.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("error logger:" + message);
    }
}
