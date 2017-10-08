package personal.nathan.adapter.homework;

import java.io.IOException;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/10/7.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        FileIO fileIO = new FileProperties();
        fileIO.readFromFile("/Users/Nathan/Desktop/test.txt");
        fileIO.setValue("aa", "AA");
        fileIO.writeToFile("/Users/Nathan/Desktop/newtest.txt");
    }
}
