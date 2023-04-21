package Items;

import base.PageTools;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Item extends PageTools {
    private String itemName;
    public String itemInfo;
    private String itemPrice;
}
