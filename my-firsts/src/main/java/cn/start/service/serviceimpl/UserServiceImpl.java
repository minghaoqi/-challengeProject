package cn.start.service.serviceimpl;

import cn.start.dao.UserDao;
import cn.start.po.User;
import cn.start.service.UserService;
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
    public Boolean checkLogin(String username, String password) {
        User user = userDao.checkLogin(username,password);
        return user != null;
    }
}
