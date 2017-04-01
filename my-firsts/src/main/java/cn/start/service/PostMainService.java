package cn.start.service;

import java.util.List;
import java.util.Map;

import cn.start.po.PostMain;

public interface PostMainService {
	public List<PostMain> selectPostMainByParam(Map<String, Object> map);
	
}
