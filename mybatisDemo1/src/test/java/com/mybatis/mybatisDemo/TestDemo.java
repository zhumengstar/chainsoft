package com.mybatis.mybatisDemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mybatis.mybatisDemo.model.dao.daoInter.UserDaoInter;
import com.mybatis.mybatisDemo.model.entry.UserInfo;

public class TestDemo {

	/**
	 * 测试数据库jar包是否满足要求
	 */
	@Test
	public static  void testMybatis() {
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
		    
			//4.获得UserDao接口动态代理对象
			UserDaoInter userMapper=sqlSession.getMapper(UserDaoInter.class) ;
			List<UserInfo> userList=userMapper.selectUser();//调用查询方法
			System.out.println(userList+"------------");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public static void main(String[] args) {
		testMybatis();
	}
	
}
