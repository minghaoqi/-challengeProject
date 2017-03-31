package cn.start.utils;

import org.springframework.web.portlet.ModelAndView;

/**
 * Created by yoho8 on 2017/3/31.
 */
public class MyModel extends ModelAndView {

    public MyModel buildView(String view){
        this.setView(view);
        return this;
    }

    public MyModel buildData(String key,Object data){

        this.addObject(key,data);
        return this;
    }

    public static MyModel getinstance(){
        MyModel model = new MyModel();
        return model;
    }
}
