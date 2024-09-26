package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends PageBase{
    public SignInPage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(id ="input_identifierValue")
    WebElement emailTextBox;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement continueBtn;

    public void sendEmail(String email)
    {
        sendTextElement(emailTextBox,email);
    }
    public void clickOnContinueButton()
    {
        clickOnWebElement(continueBtn);
    }
}
