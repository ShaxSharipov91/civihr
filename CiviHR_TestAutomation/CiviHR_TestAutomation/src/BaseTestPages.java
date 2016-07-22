import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Created by Sharipov91 on 7/20/16.
 */
public class BaseTestPages {
    public static WebDriver driverInstance;

    public BaseTestPages(){
        driverInstance = new FirefoxDriver();

    }


}
