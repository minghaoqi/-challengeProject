package cn.start.service;

import java.util.List;
import java.util.Map;

import cn.start.vo.PostMainVo;

public interface PostMainService {
	public List<PostMainVo> selectPostMainByParam(Map<String, Object> map);
	
}
