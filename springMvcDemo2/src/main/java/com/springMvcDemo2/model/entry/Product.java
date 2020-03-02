package com.springMvcDemo2.model.entry;


/**
 * 锟斤拷品锟斤拷  3锟斤拷	锟斤拷品   锟斤拷品锟斤拷锟�   锟斤拷品锟斤拷锟斤拷  锟斤拷品锟斤拷锟斤拷   锟斤拷品锟斤拷锟斤拷
 *  锟斤拷品图片    锟桔匡拷   锟斤拷细锟斤拷锟斤拷     图片
 * @author Administrator
 *
 */
public class Product {
	
     private String proId;
     private String proName;
     private double  proPrice;//锟斤拷品锟斤拷锟斤拷
     private int proNum;//锟斤拷品锟斤拷锟斤拷
     private String  proPhoto;
     private double salCup;//锟桔匡拷
     private String  proinfo;
     
	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	public int getProNum() {
		return proNum;
	}
	public void setProNum(int proNum) {
		this.proNum = proNum;
	}
	public String getProPhoto() {
		return proPhoto;
	}
	public void setProPhoto(String proPhoto) {
		this.proPhoto = proPhoto;
	}
	public double getSalCup() {
		return salCup;
	}
	public void setSalCup(double salCup) {
		this.salCup = salCup;
	}
	public String getProinfo() {
		return proinfo;
	}
	public void setProinfo(String proinfo) {
		this.proinfo = proinfo;
	}
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", proPrice=" + proPrice + ", proNum=" + proNum
				+ ", proPhoto=" + proPhoto + ", salCup=" + salCup + ", proinfo=" + proinfo + "]";
	} 
     
    
}
