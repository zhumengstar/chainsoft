package com.springMvcDemo2.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.springMvcDemo2.model.entry.UserInfo;


@Controller
@SessionAttributes("userSe") // 讲模型中的属性信息存储到session 
public class UserController {
	@RequestMapping("/user/login.do")
	public ModelAndView userLogin(String userAccount, String userPass,HttpSession  se) {
		ModelAndView model = new ModelAndView();
		//model.addAttribute("name", "王敏");// 模型对象存储信息  请求对象中存放属性信息
		model.addObject("name", "王敏");
		UserInfo user=new UserInfo();
		user.setUserId(1);
		user.setUserName("王敏");
		user.setUserPhoto("pic/1.jpg");
		///model.addAttribute("user",user );
		model.addObject("user",user );
		model.setViewName("main");
		System.out.println("=========================");
		System.out.println(se.getAttribute("userSe"));
		return model ;
		
	}
	
	
	
	@RequestMapping("/user/login1.do")
	public String userLogin1(String userAccount, String userPass,Model model
		) {
		
		model.addAttribute("name", "王敏");// 模型对象存储信息  请求对象中存放属性信息
		UserInfo user=new UserInfo();
		user.setUserId(1);
		user.setUserName("王敏");
		user.setUserPhoto("pic/1.jpg");
		model.addAttribute("user",user );
//		session.setAttribute("userSe",user );//将数据存储到session 回话中
		model.addAttribute("userSe", user);
		//session.setMaxInactiveInterval(30*60);
		/*
		 * model.addObject("user",user ); model.setViewName("main");
		 */
		System.out.println("=========================");
		return "main" ;
		
	}
	
	@RequestMapping("/user/test")
	public String test() {
		
		return "NewFile";
	}
	
	/**
	 * 检测用户账号是否存在
	 * @param account
	 * @return
	 */
	@RequestMapping("/user/checkAcc")
	@ResponseBody //当前方法返回的信息是一个相应体
	public String userAccuntCheck(String account) {
		
		if("admin".equals(account)) {
			return "useraccount is exit ";
		}
		return "账号可以使用";
		
	}
}
