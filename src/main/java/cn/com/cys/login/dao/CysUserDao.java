package cn.com.cys.login.dao;

import cn.com.cys.schema.CysUser;
public interface CysUserDao {
    int deleteByPrimaryKey(Integer usercode);

    int insert(CysUser record);

    int insertSelective(CysUser record);

    CysUser selectByPrimaryKey(Integer usercode);

    int updateByPrimaryKeySelective(CysUser record);

    int updateByPrimaryKey(CysUser record);
}