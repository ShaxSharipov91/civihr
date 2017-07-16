package civihr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilPack.WaitFunction;

/**
 * Created by Sharipov91 on 7/20/16.
 */
public class LoginPage {
    public static WebElement loginInput, passwordInput, loginButton, logo, logoutLink;
    public static WebDriverWait wait;
    public static void GoToLoginPage() {
        Navigate.To("http://civihr-staging.civihrhosting.co.uk/");
    }

    public static void LoginToCiviHr() {
        wait = new WebDriverWait(BaseTestPages.driverInstance, 60);
        loginInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("edit-name")));
        loginInput.sendKeys("civihr_admin");

        passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("edit-pass")));
        passwordInput.sendKeys("civihr_admin");

        loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("edit-submit")));
        loginButton.click();
    }

    public static void Logout(){
        logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='civicrm-menu']/li[2]/img")));
        logo.click();
        WaitFunction.ForceWait(1000);
        logoutLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='root-menu-div']/div[2]/ul/li[3]/div/a")));
        logoutLink.click();
        WaitFunction.ForceWait(1000);
        BaseTestPages.driverInstance.quit();
    }
}
