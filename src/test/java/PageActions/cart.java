package test.java.PageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class cart {
    WebDriver driver;
    public cart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id = "continue-shopping")
    WebElement continueShopping;
    @FindBy(id = "checkout")
    WebElement checkout;
    @FindBy(className = "inventory_item_name")
    List<WebElement> items;
    @FindBy(className = "cart_item")
    List<WebElement> cartItems;

    public void backToShopping() {
        continueShopping.click();
    }

    public void checkOut() {
        checkout.click();
    }

    public void returnItems() {
        System.out.println("Products in Cart:");
        for (WebElement item: items) {
            System.out.println(item.getText());
        }
    }

    public void returnNumberOfItems() {
        System.out.println("Number of items for checkout: " + cartItems.size());
    }
}
