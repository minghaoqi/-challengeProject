package cn.start.web;

import cn.start.utils.RequestResult;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by yoho8 on 2017/3/31.
 */
public class BaseController {


    @ExceptionHandler
    @ResponseBody
    public String exp(HttpServletRequest request, Exception e){


        return "{mag:error}";
    }
}
