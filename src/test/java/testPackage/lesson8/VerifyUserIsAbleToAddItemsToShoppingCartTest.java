package testPackage.lesson8;

import Pages.Pages;
import base.BaseTest;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static Pages.Pages.loginPage;

public class VerifyUserIsAbleToAddItemsToShoppingCartTest  extends BaseTest {
    @Test
    public void addToShoppingCart (){
        Pages.loginPage().typeUserName("standard_user");
        Pages.loginPage().typeUserPassword("secret_sauce");
        Pages.loginPage().clickLoginButton();

        Selenide.sleep(500);

        List<String> mainPageHeadersText = Pages.mainPage().getMainPageHeadersText();

        while (Pages.mainPage().getAddToCartList().size() > 0){
            Pages.mainPage().clickAddToCartBtn();
        }
        Pages.mainPage().clickShoppingCart();
        Selenide.sleep(500);

        List<String> elementsNamesFromShoppingCart = Pages.cartPage().getElementsNamesFromShoppingCart();

        Assert.assertEquals(mainPageHeadersText, elementsNamesFromShoppingCart);









    }
}
