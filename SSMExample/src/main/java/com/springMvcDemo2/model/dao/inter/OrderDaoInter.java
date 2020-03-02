package com.springMvcDemo2.model.dao.inter;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.springMvcDemo2.model.entry.OrderInfo;

/**
 * �������ݿ�ӿڲ�?
 * @author Administrator
 *
 */
@Repository
public interface OrderDaoInter {
	/**
	 * ��Ӷ���?
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
	 *查询�?个用户的�?有的订单信息--包含订单的商�?
	 */
	public List<OrderInfo> orderShow(String userAccount);
	
	/**
	 * �鿴��������
	 * @param orderId
	 * @return
	 */
	public  OrderInfo  selectOrderInfoById(String orderId); 
	
}
