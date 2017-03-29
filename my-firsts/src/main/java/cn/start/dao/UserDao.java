package cn.start.dao;

import cn.start.po.User;

import java.util.List;

/**
 * Created by yoho8 on 2017/3/29.
 */
public interface UserDao {

    User checkLogin(String user, String password);
}
