package forum.item.app.controllers;

import forum.item.app.models.ItemArticle;
import forum.item.app.models.ItemTopic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemController {

    @RequestMapping(value = "/item/itemTitles", method = RequestMethod.GET)
    public List<ItemTopic> getItemTitles() {
        List<ItemTopic> itemTitles = new ArrayList<ItemTopic>();

        ItemTopic itemTitle1 = new ItemTopic();
        itemTitle1.setItemTopic("title1");
        itemTitle1.setItemTopicId(1L);
        itemTitles.add(itemTitle1);

        ItemTopic itemTitle2 = new ItemTopic();
        itemTitle2.setItemTopic("title2");
        itemTitle2.setItemTopicId(2L);
        itemTitles.add(itemTitle2);

        ItemTopic itemTitle3 = new ItemTopic();
        itemTitle3.setItemTopic("title3");
        itemTitle3.setItemTopicId(3L);
        itemTitles.add(itemTitle3);

        ItemTopic itemTitle4 = new ItemTopic();
        itemTitle4.setItemTopic("title4");
        itemTitle4.setItemTopicId(4L);
        itemTitles.add(itemTitle4);

        ItemTopic itemTitle5 = new ItemTopic();
        itemTitle5.setItemTopic("title5");
        itemTitle5.setItemTopicId(5L);
        itemTitles.add(itemTitle5);

        return itemTitles;
    }

    public List<ItemArticle> getItemArticles() {




        

        return null;
    }


}
