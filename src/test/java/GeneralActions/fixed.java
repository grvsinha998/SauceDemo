package test.java.GeneralActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class fixed extends precons {
    WebDriver driver;
    public fixed(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    //Hamburger Menu Elements
    @FindBy(id = "react-burger-menu-btn")
    WebElement menuButton;
    @FindBy(className = "bm-item-list")
    WebElement itemList;
    @FindBy(id = "inventory_sidebar_link")
    WebElement allItems;
    @FindBy(id = "about_sidebar_link")
    WebElement about;
    @FindBy(id = "logout_sidebar_link")
    WebElement logout;
    @FindBy(id = "reset_sidebar_link")
    WebElement reset;
    @FindBy(id = "react-burger-cross-btn")
    WebElement closeMenu;

    //Shopping Cart Elements
    @FindBy(className = "shopping_cart_link")
    WebElement shoppingCart;
    @FindBy(className = "shopping_cart_badge")
    WebElement cartCount;
    @FindBy(className = "product_sort_container")
    WebElement sortingOptions;

    public void openHamburgerMenu(String option) throws InterruptedException {
        menuButton.click();
        Thread.sleep(2000);
        if (option.contains("All")) {
            allItems.click();
        } else if (option.contains("About")) {
            about.click();
        } else if (option.contains("out")) {
            logout.click();
        } else if (option.contains("Reset")) {
            reset.click();
        } else {
            closeMenu.click();
        }
    }

    public void viewCart() {
        shoppingCart.click();
    }

    public void getCartCount() {
        System.out.print("Products in Cart: " + cartCount.getText());
    }
}
