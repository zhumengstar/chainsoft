package com.mybatis.mybatisDemo.model.entry;

import java.util.Date;
import java.util.List;

/**
 * ������ 2�� ���� ������� ��� �µ�ʱ�� ��Ʒ����������ϵ �� �Ƿ����˷� ������ ��ݱ�� ����״̬
 */
public class OrderInfo {
	
	private String orderId;
	private double orderMoney;
	private Date orderDdate;// �µ�ʱ��
//private  int   isToPayTransMoney;//�Ƿ����˷�
	private double transferMoney; // �˷�
	private String type; // �������
	private String cardNum;// ��ݱ��
	private int orderStatus;// ����״̬
	//��Ʒ
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
	public void setOrderDdate(Date orderDdate) {
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
	
	@Override
	public String toString() {
		return "OrderInfo [orderId=" + orderId + ", orderMoney=" + orderMoney + ", orderDate=" + orderDdate
				+ ", transferMoney=" + transferMoney + ", type=" + type + ", cardNum=" + cardNum + ", orderStatus="
				+ orderStatus + "]";
	}
	

}
