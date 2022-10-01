package test.java.PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.java.GeneralActions.precons;

public class home extends precons {

    public home() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    WebElement userName;
    @FindBy(id = "password")
    WebElement pwd;
    @FindBy(id = "login-button")
    WebElement loginBtn;
    @FindBy(xpath = "//div[text()='secret_sauce']")
    WebElement sitePwd;

    public void Login(String enterUserName) {
        //Only takes Username input.
        //Password is fetched from the website UI.
        userName.sendKeys(enterUserName);
        pwd.sendKeys(sitePwd.getText());
        loginBtn.click();
        waitForElementToAppear(By.xpath("//span[text()='Products']"));
    }

}
