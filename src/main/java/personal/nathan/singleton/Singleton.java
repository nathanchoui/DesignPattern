package personal.nathan.singleton;

/**
 * Description:
 *
 * 立即加载、线程安全
 * <p>
 * Created by zhangwei on 2017/9/3.
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
