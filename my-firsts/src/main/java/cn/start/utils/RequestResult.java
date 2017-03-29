package cn.start.utils;

import org.apache.shiro.authc.UsernamePasswordToken;

import java.util.HashMap;

/**
 * Created by yoho8 on 2017/3/28.
 */
public class RequestResult extends HashMap<String,Object> {

    private  int code;
    private String msg;

    /**
     * bind code and msg
     * @param resultInfo
     * @return
     */
    public RequestResult buildResult(ResultInfo resultInfo){
        this.put("code",resultInfo.getCode());
        this.put("msg",resultInfo.getMsg());
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken();
        return this;
    }

    /**
     * bind data
     * @param object
     * @return
     */
    public RequestResult buildData(Object object){
        this.put("data",object);
        return this;
    }

    public static RequestResult getinstance(){
        RequestResult result = new RequestResult();
        return result;
    }
}
