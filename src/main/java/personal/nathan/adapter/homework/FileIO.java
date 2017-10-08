package personal.nathan.adapter.homework;

import java.io.IOException;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/10/7.
 */
public interface FileIO {

    void readFromFile(String fileName) throws IOException;

    void writeToFile(String fileName) throws IOException;

    void setValue(String key, String value);

    String getValue(String value);
}
