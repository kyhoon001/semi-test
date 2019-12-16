package app;

import java.util.ArrayList;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Service;
import com.vo.ProductVO;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("spring.xml");
		System.out.println("factory created");
		Service<String, ProductVO> biz = (Service) factory.getBean("shopservice");
		ArrayList<ProductVO> list = null;
		try {

			list = biz.get();
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}

		factory.close();
	}

}
