import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
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
@AfterMethod
public void tearDown(){
        driver.quit();
}

    }

