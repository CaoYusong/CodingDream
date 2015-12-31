package cn.com.cys.login.dao;

import cn.com.cys.schema.CysUser;
import java.math.BigDecimal;

public interface CysUserMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(CysUser record);

    int insertSelective(CysUser record);

    CysUser selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(CysUser record);

    int updateByPrimaryKey(CysUser record);
}