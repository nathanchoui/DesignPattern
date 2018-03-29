package personal.nathan.prototype;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/3/29.
 */
public class MessageBox extends AbstractProduct {

    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i ++) {
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i < length + 4; i ++) {
            System.out.print(decochar);
        }
        System.out.println();
    }

}
