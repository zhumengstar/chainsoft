package com.mybatis.mybatisDemo.model.dao.daoInter;


import java.util.List;

import com.mybatis.mybatisDemo.model.entry.OrderInfo;


/**
 * �������ݿ�ӿڲ�
 * @author Administrator
 *
 */
public interface OrderDaoInter {
	/**
	 * ��Ӷ���
	 */
	public boolean orderAdd(OrderInfo order);
	
	/**
	 * �޸Ķ���
	 */
	public boolean orderUpdate(OrderInfo order);
	
	/**
	 * ɾ������
	 */
	public boolean orderDele(String orderId);
	
	/**
	 * 
	 *查询一个用户的所有的订单信息--包含订单的商品
	 */
	public List<OrderInfo> orderShow(String userAccount);
	
	/**
	 * �鿴��������
	 * @param orderId
	 * @return
	 */
	public  OrderInfo  selectOrderInfoById(String orderId); 
	
}
