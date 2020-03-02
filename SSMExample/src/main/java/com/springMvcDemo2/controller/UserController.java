package com.springMvcDemo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springMvcDemo2.model.entry.UserInfo;
import com.springMvcDemo2.model.service.UserServiceImp;
import com.springMvcDemo2.model.service.inter.UserServiceInter;

@Controller
public class UserController {

	//用户操作业务层
	/**
	 * 业务层对象bean 注入
	 */
	@Autowired
	private UserServiceInter userServiceImp;
	
	public void setUserServiceImp(UserServiceInter userServiceImp) {
		this.userServiceImp = userServiceImp;
	}
	
	@RequestMapping("/login")
	public String userLogin(String userAccount,String userPass) {
	UserInfo user=	userServiceImp.login(userAccount, userPass);
	System.out.println(user);
		return "main.jsp";
	}
}
