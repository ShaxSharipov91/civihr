package testPack;

import civihr.AddDocument;
import civihr.BaseTestPages;
import civihr.LoginPage;
import civihr.Navigate;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Sharipov91 on 7/20/16.
 */
public class AddDocuments extends BaseTestPages {

    @BeforeTest
    public static void InitializeDriver(){

        driverInstance.navigate().to("http://civihr-staging.civihrhosting.co.uk/");

        LoginPage.GoToLoginPage();
        LoginPage.LoginToCiviHr();

        //Verify you're in Dashboard
        String actualTitle = driverInstance.getTitle();
        String expectedTitle = "Dashboard | CiviHR 1.5 Demo";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test
    public void AddDocs(){
        Navigate.GoToDocumentsPage();
        AddDocument.ClickAddDocument();

        //Enter Email Address
        AddDocument.ClickEmailField();
        AddDocument.ClickEmailForm();
        AddDocument.EnterEmail("kh.jensen-parker@testing.info");

        //Select Doc Type
        AddDocument.ClickSelect();
        AddDocument.SelectDocType("Joining Document 2");

        //Add due date
        AddDocument.ClickDueDate();
        AddDocument.AddDueDate("30/07/2016");

        //Add Assignee
        AddDocument.ClickAddAssignee();
        AddDocument.ClickAssigneeField();
        AddDocument.ClickAssigneeForm();
        AddDocument.EnterAssigneeEmail("bgrant44@testing.org");

        //Click Save
        AddDocument.ClickSave();

        //Verify it shows in the list
        AddDocument.DocumentsTable("21/07/2016");
        Assert.assertTrue(AddDocument.documentList.isDisplayed());
    }

    @AfterTest
    public static void Logout(){
        LoginPage.Logout();
    }
}
