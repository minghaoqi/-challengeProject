package cn.start.utils.shiro;

import cn.start.dao.UserDao;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.Filter;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Created by yoho8 on 2017/4/1.
 */
public class MyFormAuthenticationFilter extends FormAuthenticationFilter implements Filter {

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {

        return  this.executeLogin(request,response);
    }

    @Override
    protected boolean executeLogin(ServletRequest request, ServletResponse response) throws Exception {

        String username = getUsername(request);
        String password = getPassword(request);
        Boolean remmberme = isRememberMe(request);
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        token.setRememberMe(remmberme);

        if(token == null) {
            String e1 = "createToken method implementation returned null. A valid non-null AuthenticationToken must be created in order to execute a login attempt.";
            throw new IllegalStateException(e1);
        } else {
            try {
                Subject subject = SecurityUtils.getSubject();
                subject.login(token);
                if(subject.isAuthenticated()){
                    return true;
                }else{
                 return false;
                }
            } catch (Exception var5) {
                this.saveRequestAndRedirectToLogin(request, response);
                return false;
            }
        }

    }
}
