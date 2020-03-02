package com.mybatis.mybatisDemo.model.entry;



import java.util.List;

/**
 * ���ﳵʵ����
 * @author Administrator
 *
 */
public class GoodsCar {
private String carNum;
private List<Product> proList;	//���ﳵ����Ʒ��

public String getCarNum() {
	return carNum;
}
public void setCarNum(String carNum) {
	this.carNum = carNum;
}

public List<Product> getProList() {
	return proList;
}
public void setProList(List<Product> proList) {
	this.proList = proList;
}
}
