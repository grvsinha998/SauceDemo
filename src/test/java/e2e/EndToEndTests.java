package test.java.e2e;

import org.testng.annotations.Test;
import test.java.GeneralActions.fixed;
import test.java.GeneralActions.precons;
import test.java.PageActions.*;

import java.io.IOException;

public class EndToEndTests extends precons{
    @Test
    public void buyAll() throws InterruptedException {
        home hp = new home(driver);
        hp.Login("standard_user","secret_sauce");

        inventory inv = new inventory(driver);
        inv.addAllItems();

        fixed fx = new fixed(driver);
        fx.sortProducts("Price (low to high)");
        fx.getCartCount();
        fx.viewCart();

        cart ct = new cart(driver);
        ct.returnItemsInCart();
        ct.checkOut();

        checkout co = new checkout(driver);
        co.enterDetailsToContinue("Gaurav","Sinha","560067");

        overview ov = new overview(driver);
        ov.getOrderOverview();

        confirmation cf = new confirmation(driver);
        cf.retrieveConfirmation();
    }
}
