package personal.nathan.singleton;

/**
 * Description:
 *
 * 线程安全、懒加载
 * <p>
 * Created by zhangwei on 2017/9/3.
 */
public class DoubleCheckLockSingleton {

    private volatile static DoubleCheckLockSingleton instance;

    private DoubleCheckLockSingleton() {}

    public static DoubleCheckLockSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (instance == null) {
                    return new DoubleCheckLockSingleton();
                }

            }
        }
        return instance;
    }

}
