package cn.start.service.impl;

import cn.start.dao.UserDao;
import cn.start.po.User;
import cn.start.service.UserService;

import cn.start.utils.RequestResult;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yoho8 on 2017/3/29.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User doLogin(String loginKey,String loginPassword) {
            UsernamePasswordToken token = new UsernamePasswordToken(loginKey,loginPassword);
            //token.setRememberMe(true);
            Subject subject = SecurityUtils.getSubject();
            subject.login(token);
        return null;
    }


}
