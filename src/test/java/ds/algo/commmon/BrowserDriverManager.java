package ds.algo.commmon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserDriverManager {

    public static WebDriver driver;
    public static ChromeOptions options;

    private BrowserDriverManager() {
    }

    public static WebDriver driverFactory() {
	if (driver == null) {

	    if (ConfigFileReader.launchBrowser().equalsIgnoreCase("Chrome")) {

		WebDriverManager.chromedriver().setup();

		options = new ChromeOptions();
		options.addArguments("--start-maximized");

		driver = new ChromeDriver(options);

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://dsportalapp.herokuapp.com/login");
	    }

	    if (ConfigFileReader.launchBrowser().equalsIgnoreCase("FireFox")) {

		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();
	    }

	    return driver;

	} else
	    return driver;

    }

}
