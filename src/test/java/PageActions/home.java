package test.java.PageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.java.GeneralActions.precons;

public class home extends precons{
    WebDriver driver;
    public home(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id = "user-name")
    WebElement userName;
    @FindBy(id = "password")
    WebElement pwd;
    @FindBy(id = "login-button")
    WebElement loginBtn;

    public void Login(String enterUserName, String enterPassword) {
        userName.sendKeys(enterUserName);
        pwd.sendKeys(enterPassword);
        loginBtn.click();
    }

}
