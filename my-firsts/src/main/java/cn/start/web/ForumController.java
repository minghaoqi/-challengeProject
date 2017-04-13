package cn.start.web;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.junit.runner.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.support.json.JSONUtils;

import cn.start.po.PostMain;
import cn.start.service.PostMainService;
import cn.start.utils.RequestResult;
import cn.start.vo.PostMainVo;

@Controller
@RequestMapping("/forum")
public class ForumController {
	
	@Autowired
	PostMainService postmainservice;
	@RequestMapping(value = "toForum")
	public ModelAndView toForum(String postTitle) {
      Map<String, Object> map =new HashMap<String,Object>();
      if(StringUtils.isNotEmpty(postTitle)){    	 
    	  map.put("postTitle", postTitle);	  
      }
        List<PostMainVo> postMains =postmainservice.selectPostMainByParam(map);
		ModelAndView md =new ModelAndView("/forum/index");
		md.addObject("list", postMains);
		return  md;
	}
	@RequestMapping(value="toPost")
	public ModelAndView toPost(HttpServletRequest  request){
		ModelAndView mv =new ModelAndView("forum/post");
	    mv.addObject("topList", postmainservice.selectTopic());
		return mv;
		
	}
	@RequestMapping(value="doPost")
	@ResponseBody
public String doPost(HttpServletRequest request,PostMain postMain){
		postMain.setUserId(1);
		postMain.setPostCreateTime(new Date());
       int i=postmainservice.addPost(postMain);
		
       if(i>0){
    	   return "Success";
       }
       
		return "fail";
	}

}
