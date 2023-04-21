package testPackage.lesson7detailItemTest;

import Items.Item;
import Pages.Pages;
import base.BaseTest;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class VerifyDetailItemCorespItemFromMainPage extends BaseTest {

    @Test
    public void checkDetailItemTest(){
        Pages.loginPage().typeUserName("standard_user");
        Pages.loginPage().typeUserPassword("secret_sauce");
        Pages.loginPage().clickLoginButton();


        Selenide.sleep(1000);

        List <Item> itemsFromMainPage = Pages.mainPage().getItems();

        Pages.mainPage().getMainPageHeaders().get(1).click();

        Selenide.sleep(500);

        Item detailItem = Pages.itemDetailsPage().getDetailItem();

        Assert.assertTrue(itemsFromMainPage.contains(detailItem));
    }


}
