package cn.start.web;

import cn.start.service.UserService;
import cn.start.utils.MyModel;
import cn.start.utils.RequestResult;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

/**
 * Created by yoho8 on 2017/3/29.
 */
@Controller
@RequestMapping("/manage")
public class IndexController{


    @Autowired
    private UserService userService;


    @RequestMapping(value = "checkLogin",method = RequestMethod.POST)
    public String checkLogin(String username,String password){

        userService.doLogin(username,password);
        return "/manage/index";
    }



    @RequestMapping(value = "toLogin")
    public String toLogin(){
        if(SecurityUtils.getSubject().getSession() != null){
            SecurityUtils.getSubject().logout();
        }
        return "/login";
    }

    @RequiresRoles("13213")
    @RequestMapping(value = "toIndex")
    public String toIndex(){

        return "/manage/index";
    }


}
