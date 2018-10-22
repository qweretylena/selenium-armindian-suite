import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest {
   private WebDriver driver;
    @Test
    public void succesLogin(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\studentb\\chromedriver.exe");
         driver =new ChromeDriver();
        driver .get("https://www.google.com");

        assertTrue(driver.getCurrentUrl().contains ("https://www.google.com"),
                "The page was not load correctly");
        driver.quit();
    }
    @BeforeMethod
    public void  setup() {

        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\studentb\\geckodriver.exe");

        driver = new FirefoxDriver();
    }
    @Test
    public void githubFailedLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWith("mail@mail.am", "Password");

        assertTrue(loginPage.isErrorMessageDisplayed(), "Error message was not displayed");


        }

@AfterMethod
public void tearDown(){
        driver.quit();
}

    }

