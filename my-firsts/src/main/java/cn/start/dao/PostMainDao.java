package cn.start.dao;

import java.util.List;
import java.util.Map;

import cn.start.po.PostMain;

public interface PostMainDao {

	List<PostMain> selectPostMainByParam(Map<String, Object> map);

	int addPost(PostMain post);

	int updatePost(PostMain post);

}
