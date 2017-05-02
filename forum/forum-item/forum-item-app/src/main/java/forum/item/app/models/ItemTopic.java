package forum.item.app.models;

public class ItemTopic {
    private Long itemTopicId;

    private String itemTopic;

    public void setItemTopic(String itemTopic) {
        this.itemTopic = itemTopic;
    }

    public void setItemTopicId(Long itemTopicId) {
        this.itemTopicId = itemTopicId;
    }

    public Long getItemTopicId() {
        return itemTopicId;
    }

    public String getItemTopic() {
        return itemTopic;
    }
}
