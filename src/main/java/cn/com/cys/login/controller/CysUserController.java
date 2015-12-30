package cn.com.cys.login.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.cys.login.service.facade.CysUserService;
import cn.com.cys.schema.CysUser;
@Controller
@RequestMapping("/user")
public class CysUserController {
	@Resource
	private CysUserService cysUserService;
	  
	@RequestMapping("/login")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		CysUser user = this.cysUserService.getUserById(userId);
		model.addAttribute("user", user);
		return "login";
	  }
}
