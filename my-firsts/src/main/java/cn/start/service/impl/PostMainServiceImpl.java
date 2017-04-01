package cn.start.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.beans.factory.annotation.Autowired;

import cn.start.dao.PostMainDao;
import cn.start.po.PostMain;
import cn.start.service.PostMainService;

public class PostMainServiceImpl implements PostMainService {
@Autowired
PostMainDao postmainDao;
	@Override
	public List<PostMain> selectPostMainByParam(Map<String, Object> map) {
		// TODO Auto-generated method stub
		
		List<PostMain> postMains =postmainDao.selectPostMainByParam(map);
		
		return postMains;
	}

	
	public static void main(String[] args) {
		PostMainService postMainService=new PostMainServiceImpl();
		Map<String, Object> map =new HashMap<String,Object>();
		map.put("userId", 1);
	  List<PostMain> mian =postMainService.selectPostMainByParam(map);	
		System.out.println(mian);
	
}
}
