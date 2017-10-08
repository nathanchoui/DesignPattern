package personal.nathan.template;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/10/8.
 */
public class StringDisplay extends AbstracDisplay {

    private int width;
    private String content;

    public StringDisplay(String content) {
        this.content = content;
        this.width = content.getBytes().length;
    }

    protected void open() {
        printLine();
    }

    protected void print() {
        System.out.println("|" + content + "|");
    }

    protected void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i ++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
