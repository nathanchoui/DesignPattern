package personal.nathan.adapter.homework;

import com.sun.xml.internal.fastinfoset.tools.FI_DOM_Or_XML_DOM_SAX_SAXEvent;

import java.io.*;
import java.util.Properties;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/10/7.
 */
public class FileProperties implements FileIO {

    private Properties properties;

    public void readFromFile(String fileName) throws IOException {
        InputStream is = new FileInputStream(fileName);
        properties = new Properties();
        properties.load(is);
        is.close();
    }

    public void writeToFile(String fileName) throws IOException {
        if (!checkPropertis()) {
            return;
        }
        OutputStream os = new FileOutputStream(fileName);
        properties.store(os, "written by FileProperties");
        os.flush();
        os.close();
    }

    public void setValue(String key, String value) {
        if (!checkPropertis()) {
            return;
        }
        properties.setProperty(key, value);
    }

    public String getValue(String key) {
        if (!checkPropertis()) {
            return null;
        }
        return properties.getProperty(key);
    }

    private boolean checkPropertis() {
        if (properties == null) {
            System.out.println("load properties first");
            return false;
        }
        return true;
    }
}
