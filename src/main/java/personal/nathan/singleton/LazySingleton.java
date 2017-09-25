package personal.nathan.singleton;

/**
 * Description:
 * 线程安全、懒加载
 *
 *
 * <p>
 * Created by zhangwei on 2017/9/3.
 */
public class LazySingleton {

    private LazySingleton() {}

    private static class SingletonHolder {
        private static final LazySingleton instance = new LazySingleton();
    }

    public static LazySingleton getInstance() {
        return SingletonHolder.instance;
    }
}
