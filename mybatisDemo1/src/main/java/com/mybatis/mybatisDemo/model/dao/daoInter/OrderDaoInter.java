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
	 * ��ѯĳ�û������ж���
	 */
	public List<OrderInfo> OrderShow(String userAccount);
	
	/**
	 * �鿴��������
	 * @param orderId
	 * @return
	 */
	public  OrderInfo  selectOrderInfoById(String orderId); 
	
}
