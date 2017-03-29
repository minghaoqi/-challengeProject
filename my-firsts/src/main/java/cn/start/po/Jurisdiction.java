package cn.start.po;

/**
 * Created by yoho8 on 2017/3/29.
 * 权限
 */
public class Jurisdiction {

    private Long id;

    private String name;//权限名称

    private String describe;//权限描述


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
