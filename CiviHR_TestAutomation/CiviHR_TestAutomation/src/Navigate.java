import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Sharipov91 on 7/20/16.
 */
public class Navigate {
    public static WebElement documentsTab;
    public static WebDriverWait wait;
    public static void To(String url) {
        BaseTestPages.driverInstance.navigate().to(url);

    }




    public static void GoToDocumentsPage(){
        wait = new WebDriverWait(BaseTestPages.driverInstance, 60);
        documentsTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='ct-dashboard']/div[2]/ul/li[2]/a")));
        documentsTab.click();
        WaitFunction.ForceWait(2000);

    }


}
