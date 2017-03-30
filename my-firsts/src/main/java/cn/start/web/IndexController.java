package cn.start.web;

import cn.start.service.UserService;
import cn.start.utils.RequestResult;

import cn.start.utils.ResultInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.security.provider.MD5;

/**
 * Created by yoho8 on 2017/3/29.
 */
@Controller
@RequestMapping("/manage")
public class IndexController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = "doLogin")
    @ResponseBody
    public RequestResult checkLogin(String username,String password){
        userService.doLogin(username,password);
       return null;
    }


    @RequestMapping(value = "toLogin")
    public String toLogin(){

        return "/login";
    }
}
