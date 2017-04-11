package cn.start.vo;

import java.io.Serializable;
import java.util.Date;

public class TopicVo implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3105803964230829847L;

	/**
	 * 话题ID
	 */
	private Long topicId;

	/**
	 * 话题名称
	 */
	private String topicName;


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
	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}
