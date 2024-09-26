package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;

    @BeforeSuite
    public void startDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jumia.com.eg/");

    }

    @AfterSuite
    public void stopDriver(){
        driver.quit();
    }
}
