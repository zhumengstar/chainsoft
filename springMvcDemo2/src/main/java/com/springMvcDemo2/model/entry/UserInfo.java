package com.springMvcDemo2.model.entry;



import java.util.Date;
import java.util.List;

/**
 * 锟矫伙拷实锟斤拷锟斤拷 1锟斤拷锟矫伙拷锟斤拷锟酵伙拷锟斤拷锟矫伙拷锟斤拷锟� 锟绞猴拷 锟斤拷锟斤拷 锟斤拷锟斤拷 锟斤拷锟斤拷 
 * 锟皆憋拷 锟矫伙拷头锟斤拷 锟街伙拷锟斤拷 锟斤拷锟� 锟斤拷锟斤拷锟斤拷 锟斤拷锟斤车 锟斤拷锟斤拷锟斤拷锟斤拷系 has 锟紺a 锟斤拷
 * 
 * @author Administrator
 *
 */
public class UserInfo {
	private int userId;// 锟矫伙拷锟斤拷锟�
	private String userAccount;// 锟绞猴拷
	private String userName;// 锟斤拷锟斤拷
	private String userPass;
	private Date userBirth;
	private String userSex;
	private String userPhoto;
	private String userPhone;
	private String type;
     //锟斤拷锟斤拷
	private List<OrderInfo> orderList;  // 锟斤拷锟叫癸拷锟斤拷锟斤拷系   锟斤拷锟捷匡拷锟�1:M锟斤拷系
	// 锟斤拷锟斤车
	private  GoodsCar goodsCar;//锟斤拷锟斤拷锟斤拷系    //锟斤拷锟捷匡拷 锟斤拷1锟斤拷1锟侥癸拷系
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
