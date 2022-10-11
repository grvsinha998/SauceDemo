package test.java.e2e;

import test.java.GeneralActions.fixed;
import test.java.GeneralActions.precons;
import test.java.PageActions.*;

import java.io.IOException;

public class EndToEndTests extends precons{
    public static void main(String[] args) throws IOException, InterruptedException {
        precons pc = new precons();
        pc.initializeDriver();
        pc.LaunchApp();

        home hp = new home(pc.driver);
        hp.Login("standard_user","secret_sauce");

        inventory inv = new inventory(pc.driver);
        inv.addAllItems();

        fixed fx = new fixed(pc.driver);
        fx.sortProducts("Price (low to high)");
        fx.getCartCount();
        fx.viewCart();

        cart ct = new cart(pc.driver);
        ct.returnItemsInCart();
        ct.checkOut();

        checkout co = new checkout(pc.driver);
        co.enterDetailsToContinue("Gaurav","Sinha","560067");

        overview ov = new overview(pc.driver);
        ov.getOrderOverview();

        confirmation cf = new confirmation(pc.driver);
        cf.retrieveConfirmation();

        pc.suiteTearDown();
    }
}
