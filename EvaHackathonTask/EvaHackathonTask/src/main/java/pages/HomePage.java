package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(xpath = "//button[@aria-label='newsletter_popup_close-cta']")
    WebElement PopUpBtn;
    @FindBy(xpath = "//label[@for='dpdw-login']")
    WebElement AccountBtn;
    @FindBy(xpath = "//a[@class='btn _prim -fw _md']")
    WebElement SignInBtn;

    public void closePopUp()
    {
        clickOnWebElement(PopUpBtn);
    }

    public void clickOnAccountButton()
    {
        clickOnWebElement(AccountBtn);
    }
    public void clickOnSignInButton()
    {
        clickOnWebElement(SignInBtn);
    }
}
