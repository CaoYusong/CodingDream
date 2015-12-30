package org.cys.test;
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import cn.com.cys.login.service.facade.CysUserService;
import cn.com.cys.schema.CysUser;


@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:config/spring-mybatis.xml"})
public class TestMyBatis {
  private static Logger logger = Logger.getLogger(TestMyBatis.class);
//	private ApplicationContext ac = null;
  @Resource
  private CysUserService userService=null;

//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

  @Test 
  public void test1() {
    CysUser user = userService.getUserById(1);
    // System.out.println(user.getUserName());
    // logger.info("值："+user.getUserName());
    logger.info(JSON.toJSONString(user));
  }
}