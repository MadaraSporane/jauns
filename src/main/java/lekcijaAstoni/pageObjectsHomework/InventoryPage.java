package lekcijaAstoni.pageObjectsHomework;

import lekcijaAstoni.pageObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryPage extends BazesLapa {
    WebDriver driver;
    private By cartButton = By.id("shopping_cart_container");

    private By addToCartOnesieButton = By.id("add-to-cart-sauce-labs-Onesie");

    public WebElement getAddToCartOnesieButton() {
        return driver.findElement(addToCartOnesieButton);
    }

    public WebElement getCartButton() {
        return driver.findElement(cartButton);
    }

    public InventoryPage(WebDriver driver) {
        super(driver);
    }
}
