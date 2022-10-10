package test.java.GeneralActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Objects;

public class fixed extends precons {
    WebDriver driver;
    public fixed(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    //Hamburger Menu Elements
    @FindBy(id = "react-burger-menu-btn")
    WebElement menuButton;
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

    //Sorting Menu
    @FindBy(className = "product_sort_container")
    WebElement sortOption;

    //Footer Elements
    @FindBy(xpath = "//a[@href='https://twitter.com/saucelabs']")
    WebElement twitter;
    @FindBy(xpath = "//a[@href='https://www.facebook.com/saucelabs']")
    WebElement facebook;
    @FindBy(xpath = "//a[@href='https://www.linkedin.com/company/sauce-labs/']")
    WebElement linkedIn;

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

    public void getCartCount() {
        System.out.println("Number of items in Cart: " + cartCount.getText());
    }

    public void viewCart() {
        shoppingCart.click();
    }

    public void sortProducts(String sortBy) throws InterruptedException {
        Select dropdown = new Select(sortOption);
        dropdown.selectByVisibleText(sortBy);
        Thread.sleep(2000);
    }

    public void goToSocial(String social) {
        if(Objects.equals(social.toLowerCase(), "twitter")) {
            twitter.click();
        } else if (Objects.equals(social.toLowerCase(), "facebook")) {
            facebook.click();
        } else {
            linkedIn.click();
        }
    }

}
