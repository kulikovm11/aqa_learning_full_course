package Pages.ItemDetailsPage;

import Items.Item;
import org.openqa.selenium.By;

public class ItemDetailsPage extends Item {

    private final By detailItemName = By.xpath("//div[@class='inventory_details_name large_size']");
    private final By detailItemInfo = By.xpath("//div[@class='inventory_details_desc large_size']");
    private final By detailItemPrice = By.xpath("//div[@class='inventory_details_price']");
    private final By backToProductsPageBtn = By.xpath("//button[text()='Back to products']");

    public Item getDetailItem(){

        Item item = new Item();
        item.setItemName(getElementText(detailItemName));
        item.setItemInfo(getElementText(detailItemInfo));
        item.setItemPrice(getElementText(detailItemPrice));
        return item;

    }

    public boolean isBackToProductsBtnPresent(){
        return isElementExist(backToProductsPageBtn);
    }

}
