package tests;

import pages.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class SignInPageTest extends TestBase{
    HomePage homePage;
    SignInPage signInPage;
    PersonalDetailsPage personalDetailsPage;
    CreateYourAccountPage createYourAccountPage;
    GenderPage genderPage;
    VerifyAccount verifyAccount;

    @DataProvider(name = "All")
    public Object[][] FirstNameProvider() {
        return new Object[][]{
                { "Omarbaidak99@gmail.com", "Baidak12345678*","Omar", "Baidak","01144477035", "08-03-2001"},
        };
    }

    @Test(dataProvider = "All")
    public void SignInProcess(String email,String password,String firstName, String lastName, String phoneNumber , String date)throws InterruptedException{
        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
        createYourAccountPage = new CreateYourAccountPage(driver);
        personalDetailsPage = new PersonalDetailsPage(driver);
        genderPage = new GenderPage(driver);
        verifyAccount = new VerifyAccount(driver);

        homePage.closePopUp();
        homePage.clickOnAccountButton();
        homePage.clickOnSignInButton();
        Thread.sleep(3000);

        signInPage.sendEmail(email);
        signInPage.clickOnContinueButton();

        createYourAccountPage.sendPassword(password);
        createYourAccountPage.sendConfirmPassword(password);
        Thread.sleep(3000);
        createYourAccountPage.clickContinueButton();

        personalDetailsPage.sendFirstName(firstName);
        personalDetailsPage.sendLastName(lastName);
        personalDetailsPage.sendPhoneNumber(phoneNumber);
        personalDetailsPage.clickOnContinueButton();

        genderPage.selectGender();
        genderPage.selectBirthDate(date);
        genderPage.checkTermsButton();
        genderPage.clickContinueButton();

        String actualUserName = verifyAccount.getUserNameText();
        String expectedUserName = verifyAccount.getExpectedUserName(firstName);
        Assert.assertEquals(actualUserName, expectedUserName);
    }

}




