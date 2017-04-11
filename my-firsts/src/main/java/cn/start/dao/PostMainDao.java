package cn.start.dao;

import java.util.List;
import java.util.Map;

import cn.start.po.PostMain;
import cn.start.po.Topic;
import cn.start.vo.PostMainVo;

public interface PostMainDao {

	/**
	 * 根据条件查询帖子列表
	 * @param map
	 * @return
	 */
	List<PostMainVo> selectPostMainByParam(Map<String, Object> map);

	/**
	 * 添加帖子
	 * @param post
	 * @return
	 */
	int addPost(PostMain post);

	/**
	 * 更新帖子/或逻辑删除帖子
	 * @param post
	 * @return
	 */
	int updatePost(PostMain post);
	
	
	/**查询所有话题
	 * @return
	 */
	List<Topic> selectTopic(); 
	

}
