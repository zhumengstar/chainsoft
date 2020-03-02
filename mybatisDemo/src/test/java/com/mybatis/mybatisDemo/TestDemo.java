package com.mybatis.mybatisDemo;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class TestDemo {

	/**
	 * 测试数据库jar包是否满足要求
	 */
	@Test
	public void testMybatis() {
		//1.创建sqlSessionBuilder 对象
		
		SqlSessionFactoryBuilder sqlSeBuilder=new SqlSessionFactoryBuilder();
		//2.获得sqlsessionFactory 对象
		try {
			InputStream	 mybatisMappingInput=
					Resources.getResourceAsStream("mybatisSqlSessionMapping.xml");
			SqlSessionFactory sessionFac=sqlSeBuilder.build(mybatisMappingInput);
			SqlSession sqlSession=sessionFac.openSession();
			System.out.println(sqlSession);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3.获得sqlSession对象
		
		
	}
	
}
