package cn.start.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.start.dao.PostMainDao;
import cn.start.po.Topic;
import cn.start.service.PostMainService;
import cn.start.vo.PostMainVo;
@Service
public class PostMainServiceImpl implements PostMainService {
@Autowired
PostMainDao postmainDao;
	@Override
	public List<PostMainVo> selectPostMainByParam(Map<String, Object> map) {
		// TODO Auto-generated method stub
		
		List<PostMainVo> postMains =postmainDao.selectPostMainByParam(map);
		
		return postMains;
	}
	@Override
	public List<Topic> selectTopic() {
		
		// TODO Auto-generated method stub
		return postmainDao.selectTopic();
	}

	
}
