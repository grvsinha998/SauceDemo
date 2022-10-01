package test.java;

import test.java.GeneralActions.precons;
import test.java.PageActions.home;

import java.io.IOException;

public class buyBackpack {

    public static void main(String[] args) throws IOException {
        precons pc = new precons();
        home hp = new home();

        pc.initializeDriver();
        pc.LaunchApp();
        hp.Login("standard_user");
        pc.suiteTearDown();

    }
}
