package personal.nathan.adapter;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/10/7.
 */
public class PrintBanner extends Banner implements Print {


    public PrintBanner(String content) {
        super(content);
    }

    public void printWeak() {
        showWithParen();
    }

    public void printStrong() {
        showWithAster();
    }
}
