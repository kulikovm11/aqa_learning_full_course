package testPackage.lesson8;

import Pages.Pages;
import base.BaseTest;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickElementByNameTest extends BaseTest {
    @Test
    public void elementByNameTest(){
        Pages.loginPage().typeUserName("standard_user");
        Pages.loginPage().typeUserPassword("secret_sauce");
        Pages.loginPage().clickLoginButton();

        Selenide.sleep(500);

        Pages.mainPage().clickElementFromMainPageByName("Sauce Labs Bike Light");
        Selenide.sleep(500);

        Assert.assertTrue(Pages.itemDetailsPage().isBackToProductsBtnPresent());

    }

}
