package com.controller;

import java.util.ArrayList;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frame.CartService;
import com.frame.OrderService;
import com.vo.CartProductVO;
import com.vo.CartVO;
import com.vo.OrderDetailVO;
import com.vo.OrderVO;

@Controller
public class OrderController {

	@Resource(name = "orderservice")
	OrderService service;
//	OrderService oservice;
	@Resource(name = "cartservice")
	CartService<String, CartVO> cservice;

	@RequestMapping("order.mc")
	public String order(HttpServletRequest request) {
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		int totalprice = Integer.parseInt(request.getParameter("totalprice"));
		String orderstat = "shipping";
		Date orderdate = new Date();
		OrderVO vo = new OrderVO(email, totalprice, address, orderstat);
		ArrayList<CartProductVO> list;
		try {
			service.register(vo);
			list = cservice.getAll(email);
			
			System.out.println(service.getorderid());
			System.out.println("list ���");
			System.out.println(list);
			System.out.println("list ��¿Ϸ�");
			for(int i = 0; i < list.size(); i++) {
				String order_id = (String) service.getorderid();
				int product_id = list.get(i).getProduct_id();
				int count = list.get(i).getCount();
				OrderDetailVO od = new OrderDetailVO(order_id,product_id,count);
				System.out.println("�����");
				System.out.println(od);
				service.registerdetail(od);
			}
			cservice.clear(vo.getEmail()); // �ֹ� �Ϸ�� �װ� �ش� īƮ ����ִ� ����.
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "redirect:cart.mc";

	}

}
