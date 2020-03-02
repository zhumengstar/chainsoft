package com.mybatis.mybatisDemo.model.dao.daoInter;



import java.util.List;

import com.mybatis.mybatisDemo.model.entry.UserInfo;

/**
 * �û����ݿ������
 * �û���ĸ�����ɾ�Ĳ�
 * @author Administrator
 */
public interface UserDaoInter {

	/**
	 * �û����
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
	 * �����ʺŲ�ѯ�û��Ƿ����
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
	
}
