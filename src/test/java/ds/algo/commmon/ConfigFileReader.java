package ds.algo.commmon;

import java.io.FileReader;
import java.util.Properties;

public class ConfigFileReader {

    public static String path = "D:\\selenium\\workspace\\DSAlgoNew\\src\\test\\resources\\configfiles\\config.properties";

    public static Properties prop = new Properties();
    public static FileReader fr;
    public static String browserKey;
    public static String launchURL;

    public static String launchBrowser() {

	try {
	    fr = new FileReader(path);
	    prop.load(fr);
	    browserKey = prop.getProperty("browser");
	    return browserKey;
	} catch (Exception e) {
	    e.printStackTrace();
	    return "Chrome";
	}

    }

    public static String launchWebsite(String URL) {
	return prop.getProperty(URL);
    }
    
}
