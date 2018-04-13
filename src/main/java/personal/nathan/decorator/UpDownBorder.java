package personal.nathan.decorator;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/8.
 */
public class UpDownBorder extends Border {

    public UpDownBorder(Display display) {
        super(display);
    }

    public int getColumns() {
        return display.getColumns();
    }

    public int getRows() {
        return display.getRows() + 2;
    }

    public String getRowText(int row) {
        // 上边框
        if (row == 0) {
            return makeLine('-', display.getColumns());
        }
        // 下边框
        else if (row == display.getRows() + 1) {
            return makeLine('-', display.getColumns());
        }
        else {
            return display.getRowText(row - 1);
        }
    }

    private String makeLine(char ch, int count) {         // 生成一个重复count次字符ch的字符串
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
