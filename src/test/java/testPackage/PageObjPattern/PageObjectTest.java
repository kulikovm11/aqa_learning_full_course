package testPackage.PageObjPattern;

import base.BaseTest;
import org.testng.annotations.Test;

import static Pages.Pages.*;

public class PageObjectTest extends BaseTest {

//    @Test
    public void test(){
        loginPage().typeUserName("standard_user");
        loginPage().typeUserPassword("secret_sauce");
        loginPage().clickLoginButton();

        mainPage().waitUntilMainPageNotLoad();
        mainPage().clickBurgerMenu();
        mainPage().getMainPageButtons().get(1).click();
        mainPage().getMainPageButtons().get(0).click();
        mainPage().getMainPageButtons().get(3).click();
        mainPage().clickShoppingCart();

//        cartPage().getRemoveButtons().get(0).click();
//        cartPage().getRemoveButtons().get(1).click();
////        cartPage().clickContinueShoppingButton();
//        cartPage().clickCheckOutButton();

    }




}
