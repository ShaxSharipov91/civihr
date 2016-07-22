import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Sharipov91 on 7/20/16.
 */
public class AddDocument {
    public static WebElement documentsTab, closeUpdateNotice, addDocButton, emailInput, selectBox, selectEmail,
                  dueDateField, addAssigneeButton, assigneeField, saveButton, documentList;
    public static WebDriverWait wait;


    public static void ClickAddDocument(){
        closeUpdateNotice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='ui-notify-cross ui-notify-close']")));
        closeUpdateNotice.click();
        WaitFunction.ForceWait(1000);

        addDocButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='btn ng-binding']/span")));
        addDocButton.click();
        WaitFunction.ForceWait(1000);

    }

    public static void ClickEmailField(){
        WebElement emailDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='civitasks']/div/div[1]/div/div/form/div[1]/div/div[1]/div/div/span")));
        emailDiv.click();
        WaitFunction.ForceWait(1000);

    }

    public static void ClickEmailForm(){
        WebElement emailDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='civitasks']/div/div[1]/div/div/form/div[1]/div/div[1]/div/input[1]")));
        emailDiv.click();
        WaitFunction.ForceWait(1000);

    }


    public static void EnterEmail(String emailAddress){
        emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='civitasks']/div/div[1]/div/div/form/div[1]/div/div[1]/div/input[1]")));
        emailInput.sendKeys(emailAddress);
        WaitFunction.ForceWait(1000);
        emailInput.sendKeys(Keys.ENTER);
        WaitFunction.ForceWait(1000);

    }

    public static void ClickSelect(){
        selectBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='civitasks']/div/div[1]/div/div/form/div[2]/div/div[1]/div/div/select")));
        selectBox.click();
        WaitFunction.ForceWait(1000);
    }
    public static void SelectDocType(String documentType){
        selectEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[contains(.,'"+documentType+"')]")));
        selectEmail.click();
        WaitFunction.ForceWait(1000);

    }

    public static void ClickDueDate(){
        dueDateField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ct-document-due")));
        dueDateField.click();
        dueDateField.clear();

    }

    public static void AddDueDate(String date){
        WaitFunction.ForceWait(1000);
        dueDateField.sendKeys(date);
        WaitFunction.ForceWait(1000);
        dueDateField.sendKeys(Keys.ENTER);
        WaitFunction.ForceWait(1000);
    }

    public static void ClickAddAssignee(){
        addAssigneeButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(.,'Add Assignee')]")));
        addAssigneeButton.click();
        WaitFunction.ForceWait(1000);
    }

    public static void ClickAssigneeField(){
        WebElement assigneeEmailDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='civitasks']/div/div[1]/div/div/form/div[2]/div/div[4]/div[2]/div/div/span/span[1]")));
        assigneeEmailDiv.click();
        WaitFunction.ForceWait(1000);
    }

    public static void ClickAssigneeForm(){
        WebElement assigneeEmailDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='civitasks']/div/div[1]/div/div/form/div[2]/div/div[4]/div[2]/div/input[1]")));
        assigneeEmailDiv.click();
        WaitFunction.ForceWait(1000);

    }

    public static void EnterAssigneeEmail(String assigneeEmailAddress){
        assigneeField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='civitasks']/div/div[1]/div/div/form/div[2]/div/div[4]/div[2]/div/input[1]")));
        assigneeField.sendKeys(assigneeEmailAddress);
        WaitFunction.ForceWait(1000);
        assigneeField.sendKeys(Keys.ENTER);
        WaitFunction.ForceWait(1000);

    }

    public static void ClickSave(){
        saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='civitasks']/div/div[1]/div/div/form/div[3]/button[3]")));
        saveButton.click();
        WaitFunction.ForceWait(3000);
    }

    public static void DocumentsTable(String s){
        documentList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='table table-striped ct-table-documents']/tbody/tr/td[contains(.,'"+s+"')]")));
    }



}
