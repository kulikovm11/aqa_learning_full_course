package Pages;

import Pages.CartPage.CartPage;
import Pages.FilterPage.FilterPage;
import Pages.ItemDetailsPage.ItemDetailsPage;
import Pages.LoginPage.LoginPage;
import Pages.MainPage.MainPage;

public class Pages {
    private static LoginPage loginPage;
    private static MainPage mainPage;

    private static ItemDetailsPage itemDetailsPage;

    private static CartPage cartPage;
    private static FilterPage filterPage;



    public static LoginPage loginPage(){
      if (loginPage == null){
          loginPage = new LoginPage();
      }
      return loginPage;
    };

    public static MainPage mainPage(){
        if (mainPage == null){
            mainPage = new MainPage();
        }
        return mainPage;
    };


    public static ItemDetailsPage itemDetailsPage(){
        if (itemDetailsPage == null){
            itemDetailsPage = new ItemDetailsPage();
        }
        return itemDetailsPage;
    };



    public static CartPage cartPage(){
        if (cartPage == null){
            cartPage = new CartPage();
        }
        return cartPage;
    }

    public static FilterPage filterPage(){
        if (filterPage == null){
            filterPage = new FilterPage();
        }
        return filterPage;
    }





}
