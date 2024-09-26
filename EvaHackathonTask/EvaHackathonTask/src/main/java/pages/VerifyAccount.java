package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class VerifyAccount extends PageBase{
    public VerifyAccount(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//label[@for='dpdw-login']")
    WebElement userName;
    public String getUserNameText()throws InterruptedException {
        Thread.sleep(7000);
        return userName.getText();
    }
    public String getExpectedUserName(String firstName)
    {
        return "Hi, " + firstName;
    }
}
