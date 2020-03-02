package com.mybatis.mybatisDemo.model.entry;

import java.util.Date;
import java.util.List;

/**
 * �û�ʵ���� 1���û����ͻ����û���� �ʺ� ���� ���� ���� 
 * �Ա� �û�ͷ�� �ֻ��� ��� ������ ���ﳵ ��������ϵ has �Ca ��
 * 
 * @author Administrator
 *
 */
public class UserInfo {
	private int userId;// �û����
	private String userAccount;// �ʺ�
	private String userName;// ����
	private String userPass;
	private Date userBirth;
	private String userSex;
	private String userPhoto;
	private String userPhone;
	private String type;
     //����
	private List<OrderInfo> orderList;  // ���й�����ϵ   ���ݿ��1:M��ϵ
	// ���ﳵ
	private  GoodsCar goodsCar;//������ϵ    //���ݿ� ��1��1�Ĺ�ϵ
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public Date getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(Date userBirth) {
		this.userBirth = userBirth;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userAccount=" + userAccount + ", userName=" + userName + ", userPass="
				+ userPass + ", userBirth=" + userBirth + ", userSex=" + userSex + ", userPhoto=" + userPhoto
				+ ", userPhone=" + userPhone + ", type=" + type + "]";
	}

}
