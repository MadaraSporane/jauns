package lekcijaAstoni.pageObjectsHomework;

import lekcijaAstoni.pageObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.prefs.BackingStoreException;
public class LoginPage extends BazesLapa{
    WebDriver driver;

    private By usernameInputField = By.id("user-name");
    private By passwordInputField = By.id("pasword");
    private By loginButton = By.id("login-button");
    private By errorTextField = By.cssSelector("div.error-message-container h3");

public LoginPage(WebDriver driver)
{
    super(driver);
}
    public WebElement getusernameField() {
        return driver.findElement(usernameInputField);
    }

    public WebElement getPaswordField() {
        return driver.findElement(passwordInputField);
    }

    public WebElement getErrorTextField() {
        return driver.findElement(errorTextField);
    }

    public WebElement getloginButton() {
        return driver.findElement(loginButton);
    }

    public void login(String username, String password) {
        getusernameField().sendKeys(username);
        getPaswordField().sendKeys(password);
        getErrorTextField().click();


    }
}








