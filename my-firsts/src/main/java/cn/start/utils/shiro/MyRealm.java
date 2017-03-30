package cn.start.utils.shiro;

import cn.start.dao.UserDao;
import cn.start.po.User;
import cn.start.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yoho8 on 2017/3/30.
 * 重写数据库查询认证  比如以后可以用username和手机号 邮箱等都可以登录
 */
public class MyRealm extends AuthorizingRealm implements InitializingBean{


    @Autowired
    private UserDao userDao;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        //获取用户名
        UsernamePasswordToken token= (UsernamePasswordToken)authenticationToken;
        String loginKey = token.getPrincipal().toString();
        String loginPwd = new String(token.getPassword());
        //查询数据库
        User user = userDao.doLogin(loginKey);
        if(user==null){//  没查到
            return null;
        }else{
            if(!loginPwd.equals(user.getPassword())){
                return null;
            }
        }

        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(loginKey,user.getPassword(),user.getRealName());


        return simpleAuthenticationInfo;
    }


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //加载身份信息
        String prama = principalCollection.getPrimaryPrincipal().toString();
        System.out.print(prama);
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
