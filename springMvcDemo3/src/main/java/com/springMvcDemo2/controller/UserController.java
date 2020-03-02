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
	@RequestMapping(value = "/user/checkAcc",produces = {"text/html;charset=utf-8"})
	@ResponseBody //当前方法返回的信息是一个相应体
	public String userAccuntCheck(String account) {
		
		if("admin".equals(account)) {
			return "useraccount is exit ";
		}
		return "账号可以使用";
		
	}
	
	/**
	 * 相应json 格式数据
	 */
	/**
	 * 
	 * @param resp服务端响应对象  给客户端相应相关信息
	 */
	@RequestMapping(value = "user/testJson")
	public void respJsonInfo( HttpServletResponse resp) {
		List<UserInfo> li=new ArrayList();//创建集合对象
		UserInfo  user=new UserInfo();
		user.setUserName("王敏");
		user.setUserAccount("wm123456");
		user.setUserPhone("18966901541");
		
		String objJson=JSONObject.toJSONString(user); //将对象转换为json 字符串
		
		UserInfo  user1=new UserInfo();
		user.setUserName("王冰");
		user.setUserAccount("wangbing123");
		user.setUserPhone("13930303000");
		UserInfo  user2=new UserInfo();
		user.setUserName("余婷婷");
		user.setUserAccount("yu123456");
		user.setUserPhone("1346578291");
		li.add(user); //将用户对象存储到集合中
		li.add(user1);
		li.add(user2);
		System.out.println("++++++++++++++++++++++++");
		resp.setContentType("text/json"); //相应的文本格式
		resp.setCharacterEncoding("utf-8");
		try {
			PrintWriter write= resp.getWriter();//获得输出流
		//	write.write("大家好");
			System.out.println(objJson);
			write.write(objJson);//相应json 数据
			write.flush();
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * 相应json 格式数据
	 */
	/**
	 * 
	 * @param resp服务端响应对象  给客户端相应相关信息
	 */
	@RequestMapping(value = "user/testJsonArray")
	public void respJsonArrayInfo( HttpServletResponse resp) {
		List<UserInfo> li=new ArrayList();//创建集合对象
		UserInfo  user=new UserInfo();
		user.setUserName("王敏");
		user.setUserAccount("wm123456");
		user.setUserPhone("18966901541");

		UserInfo  user1=new UserInfo();
		user1.setUserName("王冰");
		user1.setUserAccount("wangbing123");
		user1.setUserPhone("13930303000");
		UserInfo  user2=new UserInfo();
		user2.setUserName("余婷婷");
		user2.setUserAccount("yu123456");
		user2.setUserPhone("1346578291");
		li.add(user); //将用户对象存储到集合中
		li.add(user1);
		li.add(user2);
		System.out.println("++++++++++++++++++++++++");
		resp.setContentType("text/json"); //相应的文本格式
		resp.setCharacterEncoding("utf-8");
		try {
			PrintWriter write= resp.getWriter();//获得输出流
		
			//String objJson=JSONObject.toJSONString(li); //将集合对象转换为json 字符串
			JSONArray jsonArray=JSONArray.fromObject(li); //转职json对象集
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
