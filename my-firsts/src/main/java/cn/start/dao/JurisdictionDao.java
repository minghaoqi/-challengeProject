package cn.start.dao;

import cn.start.po.Jurisdiction;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by yoho8 on 2017/3/31.
 */
public interface JurisdictionDao {

    List<Jurisdiction> listJurisdictionByRole(@Param("roleids") Long[] roleids);
}
