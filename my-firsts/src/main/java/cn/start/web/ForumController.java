package cn.start.web;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.start.service.PostMainService;
import cn.start.vo.PostMainVo;

@Controller
@RequestMapping("/forum")

public class ForumController {
	
	@Autowired
	PostMainService postmainservice;
	@RequestMapping(value = "toForum")
	public ModelAndView toForum(String name) {
      Map<String, Object> map =new HashMap<String,Object>();
      
		
		List<PostMainVo> postMains =postmainservice.selectPostMainByParam(map);
		ModelAndView md =new ModelAndView("/forum/index");
		md.addObject("list", postMains);
		return  md;
	}

}
