package cn.start.web;

import cn.start.utils.RequestResult;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.portlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by yoho8 on 2017/3/31.
 */
public class BaseController {


    @ExceptionHandler
    public ModelAndView exp(HttpServletRequest request, Exception e){

        String msg = "";
        ModelAndView model = new ModelAndView();
        model.setView("/login");
        if(e instanceof UnknownAccountException){
            System.out.print("用户名没找到");
        }else if(e instanceof IncorrectCredentialsException){
            System.out.print("用户名密码错误");
        }else{
            msg = "系统错误";
        }
        model.addObject("msg",msg);
        return model;
    }
}
