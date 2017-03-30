package cn.start.web;

import cn.start.service.UserService;
import cn.start.utils.RequestResult;
import cn.start.utils.ResultInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.apache.shiro.subject.Subject;
import org.omg.CORBA.Request;
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

    @RequestMapping(value = "doLogin")
    @ResponseBody
    public RequestResult checkLogin(String username,String password){
        try {
        	userService.checkLogin("qwe", "asdas");
            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username,password);
            usernamePasswordToken.isRememberMe();
            Subject subject = SecurityUtils.getSubject();
            subject.login(usernamePasswordToken);
            if(subject.isAuthenticated()){
                System.out.print("---------------haole-----------");
            }else{
                System.out.print("---------------2222222-----------");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        RequestResult result = RequestResult.getinstance();
        result.buildResult(ResultInfo.SUCCESS);
        result.buildData(new Integer[]{1,2,1});
        return result;
    }


    @RequestMapping(value = "toLogin")
    public String toLogin(){

        return "/login";
    }
}
