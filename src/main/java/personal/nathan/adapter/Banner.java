package personal.nathan.adapter;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/10/7.
 */
public class Banner {
    private String content;
    public Banner(String content) {
        this.content = content;
    }
    public void showWithParen() {
        System.out.println("(" + content + ")");
    }
    public void showWithAster() {
        System.out.println("*" + content + "*");
    }
}
