package cn.start.web;

import javax.print.attribute.standard.RequestingUserName;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/forum")

public class ForumController {
	@RequestMapping(value = "toForum")
	public ModelAndView toForum(String name) {
    
		
		
		return new ModelAndView("/forum/index");
	}

}
