package forum.item.app.models;

public class ItemTitle {
    private Long itemTitleId;

    private String itemTitle;


    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public void setItemTitleId(Long itemTitleId) {
        this.itemTitleId = itemTitleId;
    }

    public Long getItemTitleId() {
        return itemTitleId;
    }

    public String getItemTitle() {
        return itemTitle;
    }
}
