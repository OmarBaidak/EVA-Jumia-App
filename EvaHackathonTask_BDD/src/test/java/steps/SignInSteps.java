package steps;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.*;
import tests.TestBase;

public class SignInSteps extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    PersonalDetailsPage personalDetailsPage;
    CreateYourAccountPage createYourAccountPage;
    GenderPage genderPage;
    VerifyAccount verifyAccount;

    @Given("The user is on Jumia Home page")
    public void the_user_is_on_jumia_home_page() {
        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
        createYourAccountPage = new CreateYourAccountPage(driver);
        personalDetailsPage = new PersonalDetailsPage(driver);
        genderPage = new GenderPage(driver);
        verifyAccount = new VerifyAccount(driver);
    }
    @When("the user closes the PopUp,clicks on the Account button then Sign In button")
    public void the_user_closes_the_pop_up_clicks_on_the_account_button_then_sign_in_button() throws Throwable{
        homePage.closePopUp();
        homePage.clickOnAccountButton();
        homePage.clickOnSignInButton();
        Thread.sleep(3000);
    }
    @And("the user enters a valid email {string},clicks on the Continue button")
    public void the_user_enters_an_email_clicks_on_the_continue_button(String email) {
        signInPage.sendEmail(email);
        signInPage.clickOnContinueButton();
    }
    @And("the user enters valid password and confirmPassword {string}, clicks the Continue button")
    public void the_user_enters_valid_and_valid_clicks_the_continue_button(String password) throws Throwable{
        createYourAccountPage.sendPassword(password);
        createYourAccountPage.sendConfirmPassword(password);
        Thread.sleep(3000);
        createYourAccountPage.clickContinueButton();
    }
    @And("the user enters their personal data {string} , {string} , {string},clicks Continue button")
    public void the_user_enters_their_personal_data_clicks_continue_button(String firstName, String lastName, String phoneNumber) {
        personalDetailsPage.sendFirstName(firstName);
        personalDetailsPage.sendLastName(lastName);
        personalDetailsPage.sendPhoneNumber(phoneNumber);
        personalDetailsPage.clickOnContinueButton();
    }
    @And("the user selects their gender, {string},accepts the terms and conditions,clicks the Continue button")
    public void the_user_selects_their_gender_accepts_the_terms_and_conditions_clicks_the_continue_button(String date) throws Throwable{
        genderPage.selectGender();
        genderPage.selectBirthDate(date);
        genderPage.checkTermsButton();
        genderPage.clickContinueButton();
    }
    @Then("the user should be successfully registered with the {string}")
    public void the_user_successfully_registered(String firstName)throws Throwable{
        String actualUserName = verifyAccount.getUserNameText();
        String expectedUserName = verifyAccount.getExpectedUserName(firstName);
        Assert.assertEquals(actualUserName, expectedUserName);
    }
}
