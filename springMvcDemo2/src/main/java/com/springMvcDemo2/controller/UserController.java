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
@SessionAttributes("userSe") // ��ģ���е�������Ϣ�洢��session 
public class UserController {
	@RequestMapping("/user/login.do")
	public ModelAndView userLogin(String userAccount, String userPass,HttpSession  se) {
		ModelAndView model = new ModelAndView();
		//model.addAttribute("name", "����");// ģ�Ͷ���洢��Ϣ  ��������д��������Ϣ
		model.addObject("name", "����");
		UserInfo user=new UserInfo();
		user.setUserId(1);
		user.setUserName("����");
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
		
		model.addAttribute("name", "����");// ģ�Ͷ���洢��Ϣ  ��������д��������Ϣ
		UserInfo user=new UserInfo();
		user.setUserId(1);
		user.setUserName("����");
		user.setUserPhoto("pic/1.jpg");
		model.addAttribute("user",user );
//		session.setAttribute("userSe",user );//�����ݴ洢��session �ػ���
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
	 * ����û��˺��Ƿ����
	 * @param account
	 * @return
	 */
	@RequestMapping("/user/checkAcc")
	@ResponseBody //��ǰ�������ص���Ϣ��һ����Ӧ��
	public String userAccuntCheck(String account) {
		
		if("admin".equals(account)) {
			return "useraccount is exit ";
		}
		return "�˺ſ���ʹ��";
		
	}
}
