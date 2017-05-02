package forum.item.app.models;

public class ItemArticle {

    private Long articleId;

    private Long itemTopicId;

    private String articleTopic;

    public void setItemTopicId(Long itemTopicId) {
        this.itemTopicId = itemTopicId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public void setArticleTopic(String articleTopic) {
        this.articleTopic = articleTopic;
    }

    public Long getItemTopicId() {
        return itemTopicId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public String getArticleTopic() {
        return articleTopic;
    }
}
