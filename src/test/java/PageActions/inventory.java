package test.java.PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.java.GeneralActions.precons;

import java.util.List;

public class inventory extends precons{
    WebDriver driver;
    public inventory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(className = "inventory_item_name")
    List<WebElement> itemsName;
    @FindBy(xpath = "//button[text()='Add to cart']")
    List<WebElement> addToCartButtons;

    public void addItemToCart(String inputItemName) throws InterruptedException {
        String itemXpath = "//div[@class='inventory_item_name'][contains(text(),'" + inputItemName + "')]/parent::a/parent::div/following-sibling::div/button";
        for (WebElement itemName:itemsName) {
            String item = itemName.getText();
            if (item.contains(inputItemName)) {
                driver.findElement(By.xpath(itemXpath)).click();
                Thread.sleep(1000);
            }
        }
    }

    public void addAllItems() {
        for (WebElement addToCartButton: addToCartButtons) {
            addToCartButton.click();
        }
    }
}
