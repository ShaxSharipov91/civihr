package civihr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


/**
 * Created by Sharipov91 on 7/20/16.
 */
public class BaseTestPages {
    public static WebDriver driverInstance;

    public BaseTestPages(){
        System.setProperty("webdriver.gecko.driver", "/Users/shax/Desktop/geckodriver");
        driverInstance = new FirefoxDriver();

    }


}
