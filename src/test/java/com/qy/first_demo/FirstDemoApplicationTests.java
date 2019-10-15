package com.qy.first_demo;

import com.qy.first_demo.entity.vo.QyUserVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FirstDemoApplicationTests {

	@Test
	public void contextLoads() {
		QyUserVO qyUserVO = new QyUserVO();
		qyUserVO.setUserId(1);
		System.out.println(qyUserVO.getUserId());
	}


}
