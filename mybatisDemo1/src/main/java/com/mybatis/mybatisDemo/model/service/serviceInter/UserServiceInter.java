package com.mybatis.mybatisDemo.model.service.serviceInter;

import com.mybatis.mybatisDemo.model.entry.UserInfo;

/* �û�ҵ��ӿڲ�
 * @author Administrator
 *
 */
public interface UserServiceInter {	
   /**
       * ��¼
    */
	public UserInfo  login(String  userAccount,String userPass);
	
	/**
	 * ע��
	 */
	public  boolean userReg(UserInfo user);
	
	
	/**
	 * �޸�����
	 */
	public  boolean alterPass(UserInfo user);
	
	
	
		
}
