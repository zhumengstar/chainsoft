package com.springMvcDemo2.model.dao.inter;



import java.util.List;

import org.springframework.stereotype.Repository;

import com.springMvcDemo2.model.entry.UserInfo;


/**
 * �û����ݿ������?
 * �û���ĸ�����ɾ�Ĳ�?
 * @author Administrator
 */
@Repository
public interface UserDaoInter {

	/**
	 * �û����?
	 */
	public boolean userAdd(UserInfo user);
	/**
	 * �޸��û�
	 * @param user
	 * @return
	 */
	public boolean userAlter(UserInfo user);
	
	/**
	 * ɾ���û�
	 * @param userAccount �û��ʺ�
	 * @return
	 */
	public  boolean userDelete(String userAccount);
	
	/**
	 * �����ʺŲ�ѯ�û��Ƿ����?
	 * @param userAccount
	 * @return
	 */
	public boolean selectUserByAccount(String userAccount);
	
	/**
	 * ��ѯ�����û�����
	 * @param user
	 * @return
	 */
	public List<UserInfo> selectUser();
	
	/**
	 * �����û��˺������ѯ�û�����
	 */
	
	public UserInfo selectUserByAccAndPass(UserInfo user) ;
	
}
