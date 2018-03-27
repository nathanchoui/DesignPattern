package personal.nathan.bridge;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/3/27.
 */
public class Main {

    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, world!"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, world!"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, world!"));

        d1.display();
        d2.display();
        d3.multiDisplay(5);
    }
}
