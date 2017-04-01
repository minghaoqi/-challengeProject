package cn.start.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author qiminghao 评论实体类
 */
public class Comment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1282308986032277843L;

	/**
	 * 评论主ID
	 */
	private Long commentId;

	/**
	 * 关联帖子ID
	 */
	private Long postId;

	/**
	 * 创建人
	 */
	private int userId;

	/**
	 * 评论内容
	 */
	private String commentContent;

	/**
	 * 逻辑删除标识
	 */
	private int isDel;

	/**
	 * 评论创建时间
	 */
	private Date commentTime;

	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public int getIsDel() {
		return isDel;
	}

	public void setIsDel(int isDel) {
		this.isDel = isDel;
	}

	public Date getCommentTime() {
		return commentTime;
	}

	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}

}
