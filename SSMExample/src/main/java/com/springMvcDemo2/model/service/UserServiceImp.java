package com.springMvcDemo2.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springMvcDemo2.model.dao.inter.UserDaoInter;
import com.springMvcDemo2.model.entry.UserInfo;
import com.springMvcDemo2.model.service.inter.UserServiceInter;

/**
 * ï¿½Ã»ï¿½Òµï¿½ï¿½Êµï¿½Ö²ï¿½
 * @author Administrator
 *
 */
@Service
public class UserServiceImp implements UserServiceInter {

	/**
	 * Dao ÊµÌå¶ÔÏó×¢Èë
	 */
	@Autowired
  private	UserDaoInter userDaoInter;
	
  public void setUserDaoInter(UserDaoInter userDaoInter) {
	this.userDaoInter = userDaoInter;
}
	public UserInfo login(String userAccount, String userPass) {
		UserInfo us=new UserInfo();
			us.setUserAccount(userAccount);
			us.setUserPass(userPass);
			try {
				UserInfo user=userDaoInter.selectUserByAccAndPass(us);
				return user;
			}
		     catch (Exception e) {
				System.out.println("----77--------");	
			}
		return null;
	}


	public boolean userReg(UserInfo user) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean alterPass(UserInfo user) {
		// TODO Auto-generated method stub
		return false;
	}

}
