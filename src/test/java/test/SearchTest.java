package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;

public class SearchTest extends BaseClass {

    HomePage homePage;

    @BeforeMethod
    public void setup() {
        initialization();
        homePage = new HomePage(driver);
    }

    @Test
    public void verifyProductSearch() {

        homePage.searchProduct("iPhone 15");
        homePage.clickFirstProduct();
    }

    @AfterMethod
    public void closeBrowser() {
        tearDown();
    }
}
