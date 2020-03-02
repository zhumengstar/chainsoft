package com.mybatis.mybatisDemo.model.entry;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * ������ 2�� ���� ������� ��� �µ�ʱ�� ��Ʒ����������ϵ �� �Ƿ����˷� ������ ��ݱ�� ����״̬
 */
public class OrderInfo {
	
	private String orderId;
	private double orderMoney;//列名 odrerMoney
	private Date orderDdate;// 列名 orderDdate �µ�ʱ��
//private  int   isToPayTransMoney;//�Ƿ����˷�
	private double transferMoney; // �˷�
	private String type; // �������
	private String cardNum;// ��ݱ��
	private int orderStatus;// ����״̬
	//��Ʒ
	private UserInfo userInfo;
	
	private List<Product> orderProducts; // 1������n����Ʒ
	public List<Product> getOrderProducts() {
		return orderProducts;
	}
	
	public void setOrderProducts(List<Product> orderProducts) {
		this.orderProducts = orderProducts;
	}
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public double getOrderMoney() {
		return orderMoney;
	}
	public void setOrderMoney(double orderMoney) {
		this.orderMoney = orderMoney;
	}
	public Date getOrderDdate() {
		return orderDdate;
	}

	/* orderDate */
	public void setOrderDdate(Date orderDdate) {
		SimpleDateFormat dateFormate=new SimpleDateFormat("YYYY-MM:DD hh:mm:ss") ;
		
		this.orderDdate = orderDdate;
	}
	public double getTransferMoney() {
		return transferMoney;
	}
	public void setTransferMoney(double transferMoney) {
		this.transferMoney = transferMoney;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public int getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	@Override
	public String toString() {
		return "OrderInfo [orderId=" + orderId + ", orderMoney=" + orderMoney + ",\n orderDdate=" + orderDdate
				+ ", transferMoney=" + transferMoney + ", type=" + type + ", cardNum=" + cardNum + ", orderStatus="
				+ orderStatus + ", \n userInfo=" + userInfo + ", \n orderProducts=" + orderProducts + "] \n";
	}
	
	
	

}
