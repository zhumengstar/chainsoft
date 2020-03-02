package com.springMvcDemo2.model.service;

import org.springframework.stereotype.Service;

import com.springMvcDemo2.model.entry.OrderInfo;
import com.springMvcDemo2.model.service.inter.OrderServiceInter;

/**
 * ����ҵ��ʵ�ֲ�
 * @author Administrator
 *
 */
@Service
public class OrderServiceImp implements OrderServiceInter {

	public boolean order(OrderInfo order) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public void commitGetPro(String[] orderId) {
		// TODO Auto-generated method stub

	}

	
	public void orderDelete(String[] orderId) {
		// TODO Auto-generated method stub

	}

	
	public boolean orderUpdate(OrderInfo order) {
		// TODO Auto-generated method stub
		return false;
	}

}
