package com.springMvcDemo2.model.dao.inter;



import java.util.List;

import org.springframework.stereotype.Repository;

import com.springMvcDemo2.model.entry.UserInfo;


/**
 * ï¿½Ã»ï¿½ï¿½ï¿½ï¿½Ý¿ï¿½ï¿½ï¿½ï¿½ï¿½ï¿?
 * ï¿½Ã»ï¿½ï¿½ï¿½Ä¸ï¿½ï¿½ï¿½ï¿½ï¿½É¾ï¿½Ä²ï¿?
 * @author Administrator
 */
@Repository
public interface UserDaoInter {

	/**
	 * ï¿½Ã»ï¿½ï¿½ï¿½ï¿?
	 */
	public boolean userAdd(UserInfo user);
	/**
	 * ï¿½Þ¸ï¿½ï¿½Ã»ï¿½
	 * @param user
	 * @return
	 */
	public boolean userAlter(UserInfo user);
	
	/**
	 * É¾ï¿½ï¿½ï¿½Ã»ï¿½
	 * @param userAccount ï¿½Ã»ï¿½ï¿½Êºï¿½
	 * @return
	 */
	public  boolean userDelete(String userAccount);
	
	/**
	 * ï¿½ï¿½ï¿½ï¿½ï¿½ÊºÅ²ï¿½Ñ¯ï¿½Ã»ï¿½ï¿½Ç·ï¿½ï¿½ï¿½ï¿?
	 * @param userAccount
	 * @return
	 */
	public boolean selectUserByAccount(String userAccount);
	
	/**
	 * ï¿½ï¿½Ñ¯ï¿½ï¿½ï¿½ï¿½ï¿½Ã»ï¿½ï¿½ï¿½ï¿½ï¿½
	 * @param user
	 * @return
	 */
	public List<UserInfo> selectUser();
	
	/**
	 * ¸ù¾ÝÓÃ»§ÕËºÅÃÜÂë²éÑ¯ÓÃ»§¶ÔÏó
	 */
	
	public UserInfo selectUserByAccAndPass(UserInfo user) ;
	
}
