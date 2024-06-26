package com.my.bbs;

import com.my.bbs.util.PatternUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
//内容支持模块
@SpringBootTest
class MyBBSApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private DataSource dataSource;

	@Test
	void testDataSource(){
		System.out.println(dataSource!=null);
		System.out.println(dataSource);
	}

	@Test
	void testPatternUtil(){
		System.out.println(PatternUtil.isEmail("1034683568@qq.com"));
		System.out.println(PatternUtil.isEmail("zhenfeng@foxmail.com"));
		System.out.println(PatternUtil.isEmail("1034683568@163.com"));
		System.out.println(PatternUtil.isEmail("1034683568@sina.cn"));
		System.out.println(PatternUtil.isEmail("1034683568@163"));
		System.out.println(PatternUtil.isEmail("@163.com"));
		System.out.println(PatternUtil.isEmail("m5231773@gmail.com"));
	}
}
