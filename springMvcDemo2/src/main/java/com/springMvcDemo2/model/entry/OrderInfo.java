package com.springMvcDemo2.model.entry;



import java.util.Date;
import java.util.List;

/**
 * 锟斤拷锟斤拷锟斤拷 2锟斤拷 锟斤拷锟斤拷 锟斤拷锟斤拷锟斤拷锟� 锟斤拷锟� 锟铰碉拷时锟斤拷 锟斤拷品锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷系 锟斤拷 锟角凤拷锟斤拷锟剿凤拷 锟斤拷锟斤拷锟斤拷 锟斤拷荼锟斤拷 锟斤拷锟斤拷状态
 */
public class OrderInfo {
	
	private String orderId;
	private double orderMoney;
	private Date orderDdate;// 锟铰碉拷时锟斤拷
//private  int   isToPayTransMoney;//锟角凤拷锟斤拷锟剿凤拷
	private double transferMoney; // 锟剿凤拷
	private String type; // 锟斤拷锟斤拷锟斤拷锟�
	private String cardNum;// 锟斤拷荼锟斤拷
	private int orderStatus;// 锟斤拷锟斤拷状态
	//锟斤拷品
	private List<Product> orderProducts; // 1锟斤拷锟斤拷锟斤拷n锟斤拷锟斤拷品
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
