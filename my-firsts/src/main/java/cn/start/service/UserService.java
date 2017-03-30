package cn.start.service;

import cn.start.po.User;
import cn.start.utils.RequestResult;

/**
 * Created by yoho8 on 2017/3/29.
 */
public interface UserService {

    User doLogin(String loginKey,String loginPassword);
}
