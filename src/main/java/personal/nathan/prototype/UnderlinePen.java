package personal.nathan.prototype;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/3/29.
 */
public class UnderlinePen extends AbstractProduct {

    private char decochar;

    public UnderlinePen(char decochar) {
        this.decochar = decochar;
    }

    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; i ++) {
            System.out.print(decochar);
        }
        System.out.println();
    }

}
