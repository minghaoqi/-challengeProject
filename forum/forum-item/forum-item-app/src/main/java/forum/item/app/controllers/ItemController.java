package forum.item.app.controllers;

import forum.item.app.models.ItemTitle;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemController {

    @RequestMapping(value = "/item/itemTitles", method = RequestMethod.GET)
    public List<ItemTitle> getItemTitles() {
        List<ItemTitle> itemTitles = new ArrayList<ItemTitle>();

        ItemTitle itemTitle1 = new ItemTitle();
        itemTitle1.setItemTitle("title1");
        itemTitle1.setItemTitleId(1L);
        itemTitles.add(itemTitle1);

        ItemTitle itemTitle2 = new ItemTitle();
        itemTitle2.setItemTitle("title2");
        itemTitle2.setItemTitleId(1L);
        itemTitles.add(itemTitle2);

        ItemTitle itemTitle3 = new ItemTitle();
        itemTitle3.setItemTitle("title3");
        itemTitle3.setItemTitleId(1L);
        itemTitles.add(itemTitle3);

        ItemTitle itemTitle4 = new ItemTitle();
        itemTitle4.setItemTitle("title4");
        itemTitle4.setItemTitleId(1L);
        itemTitles.add(itemTitle4);

        ItemTitle itemTitle5 = new ItemTitle();
        itemTitle5.setItemTitle("title5");
        itemTitle5.setItemTitleId(1L);
        itemTitles.add(itemTitle5);

        return itemTitles;
    }


}
