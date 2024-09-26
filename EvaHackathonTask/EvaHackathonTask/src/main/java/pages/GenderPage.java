package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GenderPage extends PageBase{
    public GenderPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "gender")
    WebElement genderDropDown;
    @FindBy(xpath = "//li[@data-value='F']")
    WebElement femaleSelection;
    @FindBy(id = "input_birth_date")
    WebElement calenderDropDown;
    @FindBy(id = "acceptTC")
    WebElement termsCheckBox;
    @FindBy(id = "confirmBtn")
    WebElement confirmBtn;

    public void selectGender() throws InterruptedException {
        Thread.sleep(2000);
        clickOnWebElement(genderDropDown);
        clickOnWebElement(femaleSelection);
    }

    public void selectBirthDate(String date)
    {
        sendTextElement(calenderDropDown,date);
    }

    public void checkTermsButton()
    {
        clickOnWebElement(termsCheckBox);
    }

    public void clickContinueButton()
    { //submit
        clickOnWebElement(confirmBtn);
    }
}

