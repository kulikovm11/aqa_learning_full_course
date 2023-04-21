package Pages.MainPage;

import Items.Item;
import base.PageTools;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage extends PageTools {

    private final ElementsCollection itemNameList = $$(By.xpath("//div[@class='inventory_item_name']"));
    private final ElementsCollection addItemButtonList  = $$(By.xpath("//button[text()='Add to cart']"));

    private final By elementByName = By.xpath("//div[text()='%s']");
    private final By addToCartBtn = By.xpath("//button[text()='Add to cart']");
    private final SelenideElement mainLogo = $(By.xpath("//div[@class='app_logo']"));
    private final SelenideElement burgerMenuButton = $(By.xpath("//div[@class='bm-burger-button']"));
    private final SelenideElement filterMenuButton = $(By.xpath("//select[@class='product_sort_container']"));
    private final SelenideElement shoppingCartButton = $(By.xpath("//a[@class='shopping_cart_link']"));

    private final By elementsNames = By.xpath("//div[contains(@class,'inventory_item_name')]");
    private final By elementsInfos = By.xpath("//div[@class='inventory_item_desc']");
    private final By elementsPrices = By.xpath("//div[@class='inventory_item_price']");


    public ElementsCollection getMainPageHeaders () {
      return itemNameList.shouldBe(CollectionCondition.size(6));
    };

    public List<String> getMainPageHeadersText(){
        return getElementsText(elementsNames);
    }


    public ElementsCollection getMainPageButtons () {
      return addItemButtonList;
    };


    public void waitUntilMainPageNotLoad(){
         mainLogo.shouldBe(Condition.visible, Duration.ofMillis(3000));
    }

    public void clickBurgerMenu () {
        burgerMenuButton.shouldBe(Condition.enabled).click();
    }

    public void clickFilterDropDown(){
        filterMenuButton.shouldBe(Condition.visible).click();
    }

    public void clickShoppingCart(){
        shoppingCartButton.shouldBe(Condition.visible).click();
    }

    public List <Item> getItems(){
        List <Item> itemList = new ArrayList<>();

        List <String> namesList = getElementsText(elementsNames);
        List <String> infosList = getElementsText(elementsInfos);
        List <String> pricesList = getElementsText(elementsPrices);

        for (int i = 0; i < namesList.size(); i++) {
             Item item = new Item();
             item.setItemName(namesList.get(i));
             item.setItemInfo(infosList.get(i));
             item.setItemPrice(pricesList.get(i));

             itemList.add(item);
        }
        return itemList;

    }



    public List<SelenideElement> getAddToCartList() {
        return getElements(addToCartBtn);
    }
    public void clickAddToCartBtn(){
        click(addToCartBtn);
    }
    public void clickElementFromMainPageByName(String name){
        click(elementByName,name);
    }
}
