package com.springMvcDemo2.model.service.inter;

import com.springMvcDemo2.model.entry.OrderInfo;

public interface OrderServiceInter {

	/**
	 * �µ�
	 * @param order
	 * @return
	 */
	public boolean  order(OrderInfo order);
	
	/**
	 * ȷ���ջ�
	 */
	/* public void commitGetPro(String orderId) ; */
	public void commitGetPro(String[] orderId) ;
	
	
	/**
	 * ɾ������
	 */
	public void orderDelete(String[] orderId) ;
	
	
	/**
	 * �޸Ķ���
	 */
	public boolean orderUpdate(OrderInfo order);
	
}
