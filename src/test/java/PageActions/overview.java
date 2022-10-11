package test.java.PageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class overview {
    WebDriver driver;
    public overview(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//div[@class='summary_value_label'][1]")
    WebElement paymentInfo;
    @FindBy(xpath = "//div[@class='summary_value_label'][2]")
    WebElement shippingInfo;
    @FindBy(className = "summary_subtotal_label")
    WebElement subTotal;
    @FindBy(className = "summary_tax_label")
    WebElement tax;
    @FindBy(className = "summary_total_label")
    WebElement total;
    @FindBy(id = "finish")
    WebElement completePurchase;

    public void getOrderOverview() {
        System.out.println("Payment Info: " + paymentInfo.getText() + "\n" +
                           "Shipping Info: " + shippingInfo.getText() + "\n" +
                           subTotal.getText() + "\n" + tax.getText() + "\n" + total.getText());
        completePurchase.click();
    }
}
