package cn.start.web;

import cn.start.service.UserService;
import cn.start.utils.MyModel;
import cn.start.utils.RequestResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

/**
 * Created by yoho8 on 2017/3/29.
 */
@Controller
@RequestMapping("/manage")
public class IndexController extends BaseController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = "doLogin")
    @ResponseBody
    public MyModel checkLogin(String username,String password){
        MyModel model = MyModel.getinstance();
        model.buildView("/manage/toIndex.do").buildData("msg",null);
        userService.doLogin(username,password);
        return model;
    }


    @RequestMapping(value = "toLogin")
    public String toLogin(){

        return "/login";
    }


}
