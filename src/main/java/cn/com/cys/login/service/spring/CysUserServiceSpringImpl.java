package cn.com.cys.login.service.spring;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.cys.login.dao.CysUserDao;
import cn.com.cys.login.service.facade.CysUserService;
import cn.com.cys.schema.CysUser;


@Service
public class CysUserServiceSpringImpl implements CysUserService {
	@Resource
	private CysUserDao cysUserDao;
	public CysUser getUserById(Integer userCode) {
		return cysUserDao.selectByPrimaryKey(userCode);
	}

}
