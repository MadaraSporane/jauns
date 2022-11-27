package seleniumHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

   public WebDriver driver;

    @BeforeMethod
    public void parlukaIestatisana(){
      driver = new ChromeDriver();
        driver.manage().window().maximize();
      driver.navigate().to("https://www.saucedemo.com");
    }
    @AfterMethod
    public void satiritAizsevis(){
       driver.quit();


    }
}
