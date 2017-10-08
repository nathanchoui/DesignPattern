package personal.nathan.template;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/10/8.
 */
public class CharDisplay extends AbstracDisplay {

    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    protected void open() {
        System.out.print("<<");
    }

    protected void print() {
        System.out.print(ch);
    }

    protected void close() {
        System.out.println(">>");
    }

}
