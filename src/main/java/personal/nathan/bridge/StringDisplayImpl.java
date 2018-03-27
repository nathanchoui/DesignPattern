package personal.nathan.bridge;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/3/27.
 */
public class StringDisplayImpl extends DisplayImpl {

    private String printStr;
    private int width;

    public StringDisplayImpl(String printStr) {
        this.printStr = printStr;
        width = printStr.getBytes().length;
    }

    public void rawOpen() {
        printLine();
    }

    public void rawPrint() {
        System.out.println("|" + printStr + "|");
    }

    public void rawClose() {
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
