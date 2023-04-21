package Pages.FilterPage;

import base.PageTools;
import org.openqa.selenium.By;

public class FilterPage extends PageTools {
    private final By optionById = By.xpath("//option[%d]");
    public void clickOptionById(int id){
        click(optionById, id);
    }
}
