package personal.nathan.adapter;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/10/7.
 */
public class PrintBanner2 implements Print {

    private Banner banner;

    public PrintBanner2(String content) {
        banner = new Banner(content);
    }

    public void printWeak() {
        banner.showWithParen();
    }

    public void printStrong() {
        banner.showWithAster();
    }
}
