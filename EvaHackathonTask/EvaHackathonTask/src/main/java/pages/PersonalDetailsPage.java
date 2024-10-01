package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PersonalDetailsPage extends PageBase{
    public PersonalDetailsPage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(id = "input_first_name")
    WebElement firstNameTextBox;
    @FindBy(id = "input_last_name")
    WebElement lastNameTextBox;
    @FindBy(xpath ="//*[@id=\"card_profile_details\"]/div[4]/div[1]/div[1]")
    WebElement countryDropDown;
    @FindBy(xpath = "//li[@data-value='+20']")
    WebElement countrySelection;
    @FindBy(xpath ="//input[@name='phone[number]']")
    WebElement phoneNumberTextBox;
    @FindBy(xpath = "//*[@id='card_profile_details']/div[5]/div/button")
    WebElement continueBtn;
    public void sendFirstName(String firstName)
    {
        sendTextElement(firstNameTextBox,firstName);
    }
    public void sendLastName(String lastName)
    {
        sendTextElement(lastNameTextBox,lastName);
    }

    public void sendPhoneNumber(String phoneNumber)
    {
        sendTextElement(phoneNumberTextBox,phoneNumber);
    }
    public void clickOnContinueButton()
    {
        clickOnWebElement(continueBtn);
    }
}
