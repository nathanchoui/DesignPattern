package personal.nathan.adapter;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/10/7.
 */
public class Main {

    public static void main(String[] args) {
        // 利用继承实现适配器
        Print print = new PrintBanner("extends adapter");
        print.printWeak();
        print.printStrong();

        // 利用组合实现适配器
        Print print2 = new PrintBanner2("aggregate adapter");
        print2.printWeak();
        print2.printStrong();
    }
}
