package test.java.PageActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.List;

import static com.google.common.collect.Streams.zip;
import static java.lang.System.in;

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
    @FindBy(className = "inventory_item_price")
    List<WebElement> itemPrices;

    public void backToShopping() {
        continueShopping.click();
    }

    public void checkOut() {
        checkout.click();
    }

    public void returnItemsInCart() {
        System.out.println("Number of items for checkout: " + cartItems.size() + "\n" + "Products in Cart:");
        Iterator<WebElement> ItemIterator = items.iterator();
        Iterator<WebElement> itemPriceIterator = itemPrices.iterator();
        while (ItemIterator.hasNext()) {
            System.out.println(ItemIterator.next().getText() + ": " + itemPriceIterator.next().getText());
        }
    }
}
