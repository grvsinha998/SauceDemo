package test.java.PageActions;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class confirmation {
    WebDriver driver;
    public confirmation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(className = "complete-header")
    WebElement thanksHead;
    @FindBy(className = "complete-text")
    WebElement thanksText;
    @FindBy(id = "back-to-products")
    WebElement backHome;

    public void retrieveConfirmation() {
        System.out.println(thanksHead.getText() + "\n" + thanksText.getText());
        backHome.click();
    }
}
