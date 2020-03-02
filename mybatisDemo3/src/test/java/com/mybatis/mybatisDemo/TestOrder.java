package com.mybatis.mybatisDemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mybatis.mybatisDemo.model.dao.daoInter.OrderDaoInter;
import com.mybatis.mybatisDemo.model.dao.daoInter.UserDaoInter;
import com.mybatis.mybatisDemo.model.entry.OrderInfo;
import com.mybatis.mybatisDemo.model.entry.UserInfo;

public class TestOrder {

	@Test
	public static void testOrderShow() {
		


		//1.创建sqlSessionBuilder 对象
		
		SqlSessionFactoryBuilder sqlSeBuilder=new SqlSessionFactoryBuilder();
		//2.获得sqlsessionFactory 对象
		try {
			InputStream	 mybatisMappingInput=
					Resources.getResourceAsStream("mybatisSqlSessionMapping.xml");
			SqlSessionFactory sessionFac=sqlSeBuilder.build(mybatisMappingInput);
			//3.获得sqlSession对象
			SqlSession sqlSession=sessionFac.openSession();
			System.out.println(sqlSession);
		    OrderDaoInter orderDao=sqlSession.getMapper(OrderDaoInter.class);
		    List<OrderInfo> orderList=orderDao.orderShow("wm001");
		    System.out.println(orderList);
			sqlSession.commit();//事务提交
			sqlSession.close();
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		testOrderShow();
	}
}
