package Pages.CartPage;

import base.PageTools;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CartPage extends PageTools {

//    private final ElementsCollection removeButtons = $$(By.xpath("//button[@class='btn btn_secondary btn_small cart_button']"));
//    private final SelenideElement continueShoppingButton = $(By.xpath("//button[@name='continue-shopping']"));
//    private final SelenideElement checkOutButton = $(By.xpath("//button[@id='checkout']"));
//
//    public ElementsCollection getRemoveButtons(){
//        return removeButtons;
//    }
//
//    public void clickContinueShoppingButton(){
//        continueShoppingButton.shouldBe(Condition.visible).click();
//    }
//
//    public void clickCheckOutButton(){
//        checkOutButton.shouldBe(Condition.enabled).click();
//    }

    private final By elementsNames = By.xpath("//div[contains(@class,'inventory_item_name')]");
    public List <String> getElementsNamesFromShoppingCart () {
        return getElementsText(elementsNames);
    }


}
