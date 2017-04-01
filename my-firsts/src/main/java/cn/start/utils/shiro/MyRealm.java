package cn.start.utils.shiro;

import cn.start.dao.JurisdictionDao;
import cn.start.dao.RoleDao;
import cn.start.dao.UserDao;
import cn.start.po.Jurisdiction;
import cn.start.po.Role;
import cn.start.po.User;
import cn.start.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by yoho8 on 2017/3/30.
 * 重写数据库查询认证  比如以后可以用username和手机号 邮箱等都可以登录
 */
public class MyRealm extends AuthorizingRealm{


    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private JurisdictionDao jurisdictionDao;

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

        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(loginKey,user.getPassword(),getName());

        return simpleAuthenticationInfo;
    }


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //加载身份信息
        String prama = principalCollection.getPrimaryPrincipal().toString();
        //获取身份信息
        User user = userDao.doLogin(prama);
        if(user == null) return null;
        //获取角色信息
        List<Role> roles = roleDao.listRoleByUser(user.getId());
        int roleSize = roles.size();
        //根据角色 获取权限信息
        Long[] roleids = new Long[roleSize];
        for(int i = 0;i < roleSize;i++){
            roleids[i] = roles.get(i).getId();
        }
        List<Jurisdiction> jurisdictions = jurisdictionDao.listJurisdictionByRole(roleids);
        //去除重复
        Set<String> juriSet = new HashSet<String>();
        for(Jurisdiction j : jurisdictions){
            juriSet.add(j.getName());
        }
        Set<String> roleSet = new HashSet<String>();
        for(Role r : roles){
            roleSet.add(r.getRoleName());
        }

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setRoles(roleSet);
        simpleAuthorizationInfo.setStringPermissions(juriSet);
        return simpleAuthorizationInfo;
    }

    @Override
    public String getName() {
        return "custmerRealm";
    }
}
