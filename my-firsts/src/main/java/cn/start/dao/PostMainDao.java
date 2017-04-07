package cn.start.dao;

import java.util.List;
import java.util.Map;

import cn.start.po.PostMain;
import cn.start.vo.PostMainVo;

public interface PostMainDao {

	List<PostMainVo> selectPostMainByParam(Map<String, Object> map);

	int addPost(PostMain post);

	int updatePost(PostMain post);

}
