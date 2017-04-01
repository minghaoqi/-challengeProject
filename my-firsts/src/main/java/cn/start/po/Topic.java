package cn.start.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author qiminghao 话题实体类
 */
public class Topic implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5565829790904260902L;

	/**
	 * 话题ID
	 */
	private Long topicId;

	/**
	 * 话题名称
	 */
	private String topic_name;

	/**
	 * 话题创建时间
	 */
	private Date createTime;

	/**
	 * 逻辑删除标识
	 */
	private int isDel;

	/**
	 * 创建人ID
	 */
	private int userId;

	public Long getTopicId() {
		return topicId;
	}

	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}

	public String getTopic_name() {
		return topic_name;
	}

	public void setTopic_name(String topic_name) {
		this.topic_name = topic_name;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getIsDel() {
		return isDel;
	}

	public void setIsDel(int isDel) {
		this.isDel = isDel;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
