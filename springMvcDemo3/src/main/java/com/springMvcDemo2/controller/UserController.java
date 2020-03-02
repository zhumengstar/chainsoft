package com.springMvcDemo2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.springMvcDemo2.model.entry.UserInfo;
import net.sf.json.JSONArray;
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
	@RequestMapping(value = "/user/checkAcc",produces = {"text/html;charset=utf-8"})
	@ResponseBody //��ǰ�������ص���Ϣ��һ����Ӧ��
	public String userAccuntCheck(String account) {
		
		if("admin".equals(account)) {
			return "useraccount is exit ";
		}
		return "�˺ſ���ʹ��";
		
	}
	
	/**
	 * ��Ӧjson ��ʽ����
	 */
	/**
	 * 
	 * @param resp�������Ӧ����  ���ͻ�����Ӧ�����Ϣ
	 */
	@RequestMapping(value = "user/testJson")
	public void respJsonInfo( HttpServletResponse resp) {
		List<UserInfo> li=new ArrayList();//�������϶���
		UserInfo  user=new UserInfo();
		user.setUserName("����");
		user.setUserAccount("wm123456");
		user.setUserPhone("18966901541");
		
		String objJson=JSONObject.toJSONString(user); //������ת��Ϊjson �ַ���
		
		UserInfo  user1=new UserInfo();
		user.setUserName("����");
		user.setUserAccount("wangbing123");
		user.setUserPhone("13930303000");
		UserInfo  user2=new UserInfo();
		user.setUserName("������");
		user.setUserAccount("yu123456");
		user.setUserPhone("1346578291");
		li.add(user); //���û�����洢��������
		li.add(user1);
		li.add(user2);
		System.out.println("++++++++++++++++++++++++");
		resp.setContentType("text/json"); //��Ӧ���ı���ʽ
		resp.setCharacterEncoding("utf-8");
		try {
			PrintWriter write= resp.getWriter();//��������
		//	write.write("��Һ�");
			System.out.println(objJson);
			write.write(objJson);//��Ӧjson ����
			write.flush();
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * ��Ӧjson ��ʽ����
	 */
	/**
	 * 
	 * @param resp�������Ӧ����  ���ͻ�����Ӧ�����Ϣ
	 */
	@RequestMapping(value = "user/testJsonArray")
	public void respJsonArrayInfo( HttpServletResponse resp) {
		List<UserInfo> li=new ArrayList();//�������϶���
		UserInfo  user=new UserInfo();
		user.setUserName("����");
		user.setUserAccount("wm123456");
		user.setUserPhone("18966901541");

		UserInfo  user1=new UserInfo();
		user1.setUserName("����");
		user1.setUserAccount("wangbing123");
		user1.setUserPhone("13930303000");
		UserInfo  user2=new UserInfo();
		user2.setUserName("������");
		user2.setUserAccount("yu123456");
		user2.setUserPhone("1346578291");
		li.add(user); //���û�����洢��������
		li.add(user1);
		li.add(user2);
		System.out.println("++++++++++++++++++++++++");
		resp.setContentType("text/json"); //��Ӧ���ı���ʽ
		resp.setCharacterEncoding("utf-8");
		try {
			PrintWriter write= resp.getWriter();//��������
		
			//String objJson=JSONObject.toJSONString(li); //�����϶���ת��Ϊjson �ַ���
			JSONArray jsonArray=JSONArray.fromObject(li); //תְjson����
			String objJson=jsonArray.toString();
			System.out.println(objJson);
		    write.write(objJson);
			write.flush();
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
