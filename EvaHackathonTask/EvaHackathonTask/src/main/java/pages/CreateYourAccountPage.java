package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateYourAccountPage extends PageBase{
    public CreateYourAccountPage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordTextBox;
    @FindBy(xpath = "//input[@autocomplete='confirm-password']")
    WebElement confirmPasswordTextBox;
    @FindBy(xpath = "//*[@id=\"card_password\"]/div[5]/div/button")
    WebElement continueBtn;
    public void sendPassword(String password)
    {
        sendTextElement(passwordTextBox,password);
    }
    public void sendConfirmPassword(String confirmPassword)
    {
        sendTextElement(confirmPasswordTextBox,confirmPassword);
    }
    public void clickContinueButton()
    {
        clickOnWebElement(continueBtn);
    }

}
