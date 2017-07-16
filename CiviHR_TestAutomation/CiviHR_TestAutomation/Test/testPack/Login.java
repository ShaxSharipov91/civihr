package testPack;

import civihr.BaseTestPages;
import civihr.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Sharipov91 on 7/20/16.
 */
public class Login extends BaseTestPages {

    @BeforeTest
    public static void InitializeDriver(){
         driverInstance.navigate().to("http://civihr-staging.civihrhosting.co.uk/");
    }
    @Test
    public void userLogin(){
        LoginPage.GoToLoginPage();
        LoginPage.LoginToCiviHr();

        //Verify you're in Dashboard
        String actualTitle = driverInstance.getTitle();
        String expectedTitle = "Dashboard | CiviHR staging site";
        Assert.assertEquals(actualTitle, expectedTitle);

    }


    @AfterTest
    public static void Logout(){
        LoginPage.Logout();
    }
}
