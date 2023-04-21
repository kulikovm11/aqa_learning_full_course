package testPackage.lesson8;

import Pages.Pages;
import base.BaseTest;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyFiltersWorkCorrectTest extends BaseTest {
    @Test
    public void filterTest (){
        Pages.loginPage().typeUserName("standard_user");
        Pages.loginPage().typeUserPassword("secret_sauce");
        Pages.loginPage().clickLoginButton();

        Selenide.sleep(500);

        Pages.mainPage().clickFilterDropDown();
        Pages.filterPage().clickOptionById(2);
        Assert.assertEquals(Pages.mainPage().getMainPageHeadersText().get(0),"Test.allTheThings() T-Shirt (Red)");
    }
}
