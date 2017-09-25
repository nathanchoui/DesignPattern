package personal.nathan.singleton;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/9/3.
 */
public enum EnumSingleton {
    AA("aa");

    private String str;
    EnumSingleton(String str) {
        this.str = str;
    }
}
