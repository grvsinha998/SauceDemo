package test.java.e2e;

import test.java.GeneralActions.fixed;
import test.java.GeneralActions.precons;
import test.java.PageActions.cart;
import test.java.PageActions.home;
import test.java.PageActions.inventory;

import java.io.IOException;

public class buyBackpack {

    public static void main(String[] args) throws IOException, InterruptedException {
        precons pc = new precons();
        pc.initializeDriver();
        pc.LaunchApp();

        home hp = new home(pc.driver);
        hp.Login("standard_user","secret_sauce");

        inventory inv = new inventory(pc.driver);
//        inv.addItemToCart("Backpack");
//        inv.addItemToCart("Light");
          inv.addAllItems();

        fixed fx = new fixed(pc.driver);
        fx.openHamburgerMenu("All Items");
        fx.sortProducts("Price (low to high)");
        fx.getCartCount();
        fx.viewCart();

        cart ct = new cart(pc.driver);
        ct.returnNumberOfItems();
        ct.returnItems();
        ct.checkOut();

        pc.suiteTearDown();
    }
}
