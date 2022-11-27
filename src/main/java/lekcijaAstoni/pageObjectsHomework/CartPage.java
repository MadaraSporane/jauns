package lekcijaAstoni.pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BazesLapa {

public CartPage(WebDriver driver){
    super(driver);
}

        private By checkoutButton = By.id("checkout");
        public WebElement getCheckoutButton(){
        return driver.findElement(checkoutButton);

    }
}