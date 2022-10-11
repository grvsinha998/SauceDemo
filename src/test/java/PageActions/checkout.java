package test.java.PageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkout {
    WebDriver driver;
    public checkout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id = "first-name")
    WebElement inputFirstName;
    @FindBy(id = "last-name")
    WebElement inputLastName;
    @FindBy(id = "postal-code")
    WebElement inputZip;
    @FindBy(id = "continue")
    WebElement continueCheckout;

    public void enterDetailsToContinue(String firstName, String lastName, String ZIP) {
        inputFirstName.sendKeys(firstName);
        inputLastName.sendKeys(lastName);
        inputZip.sendKeys(ZIP);
        continueCheckout.click();
    }
}
