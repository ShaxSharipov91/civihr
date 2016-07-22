import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Sharipov91 on 7/20/16.
 */
public class EditDocument {

    public static WebElement editButton, editDoc;
    public static WebDriverWait wait;

    public static void ClickEditButton(){
        editButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='ct-dashboard']/div[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr/td[8]/div/a/i")));
        editButton.click();
        WaitFunction.ForceWait(1000);

    }

    public static void ClickEditDocument(){
        editDoc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='ct-dashboard']/div[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr/td[8]/div/ul/li[2]/a")));
        editDoc.click();
        WaitFunction.ForceWait(1000);
    }


}
