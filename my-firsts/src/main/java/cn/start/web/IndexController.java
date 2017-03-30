package cn.start.web;

import cn.start.service.UserService;
import cn.start.utils.RequestResult;
import cn.start.utils.ResultInfo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yoho8 on 2017/3/29.
 */
@Controller
@RequestMapping("/manage")
public class IndexController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = "checkLogin",method = RequestMethod.POST)
    @ResponseBody
    public RequestResult checkLogin(String username,String password){
        Boolean check = userService.checkLogin(username,password);
        RequestResult requestResult = RequestResult.getinstance();
        if(check)
            requestResult.buildResult(ResultInfo.SUCCESS);
        else
            requestResult.buildResult(ResultInfo.USER_PWD_ERROR);

        return requestResult;
    }


    @RequestMapping(value = "toLogin")
    public String toLogin(){

        return "/login";
    }
}
