package cn.start.dao;

import cn.start.po.Role;
import cn.start.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by yoho8 on 2017/3/31.
 */
public interface RoleDao {

    /**
     * 可扩展 但是记得看sql语句
     * @return
     */
    List<Role> listRoleByUser(@Param("userid") Long userid);
}
