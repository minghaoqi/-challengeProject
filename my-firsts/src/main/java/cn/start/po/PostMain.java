package cn.start.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author qiminghao 
 * 帖子主实体类
 */
public class PostMain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4850401934603928198L;

	/**
	 * 帖子主ID
	 */
	private Long postId;

	/**
	 * 帖子标题
	 */
	private String postTitle;

	/**
	 * 帖子内容
	 */
	private String postContent;
	
	/**
	 * 帖子所属话题Id
	 */
	private Long postTopicId;
	
	/**
	 * 帖子创建人
	 */
	private int userId;
	
	/**
	 * 删除标识
	 */
	private int isDel;
	
	/**
	 * 话题评论数
	 */
	private int postCommentCount;
	
	/**
	 * 话题创建日期
	 */
	private Date postCreateTime;

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public Long getPostTopicId() {
		return postTopicId;
	}

	public void setPostTopicId(Long postTopicId) {
		this.postTopicId = postTopicId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getIsDel() {
		return isDel;
	}

	public void setIsDel(int isDel) {
		this.isDel = isDel;
	}

	public int getPostCommentCount() {
		return postCommentCount;
	}

	public void setPostCommentCount(int postCommentCount) {
		this.postCommentCount = postCommentCount;
	}

	public Date getPostCreateTime() {
		return postCreateTime;
	}

	public void setPostCreateTime(Date postCreateTime) {
		this.postCreateTime = postCreateTime;
	}
	
	
	
}
