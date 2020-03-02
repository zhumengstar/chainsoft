package com.springMvcDemo2.model.service.inter;

import com.springMvcDemo2.model.entry.UserInfo;

/* �û�ҵ��ӿڲ�?
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
