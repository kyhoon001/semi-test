package com.controller;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frame.OrderService;
import com.frame.Service;
import com.vo.CartProductVO;
import com.vo.CartVO;
import com.vo.OrderDetailVO;
import com.vo.OrderListVO;
import com.vo.OrderVO;
import com.vo.ProductVO;
import com.vo.UserVO;

@Controller
public class OrderController {

	@Resource(name = "orderservice")
	OrderService service;

	@Resource(name = "cartservice")
	Service<String, CartVO> cservice;

	@Resource(name = "shopservice")
	Service<String, ProductVO> sservice;

	@Resource(name = "uservice")
	Service uservice;

	@RequestMapping("order.mc")
	@Transactional
	public String order(HttpServletRequest request) {
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		int totalprice = Integer.parseInt(request.getParameter("totalprice"));
		String orderstat = "shipping";
		
		OrderVO vo = new OrderVO(email, totalprice, address, orderstat);
		ArrayList<CartProductVO> list;
		try {
			
			list = cservice.ggetAll(email);
			boolean b = true;
			for (int i = 0; i < list.size(); i++) {
				
				CartVO cvo = cservice.get(list.get(i).getBasket_id());
				int pid = cvo.getProduct_id();
				ProductVO pv =  sservice.pick(pid);
				if (pv.getStock() < list.get(i).getCount()) {
					b = false;
					System.out.println("수량부족");
					
					
					String errormessage = "Out of Stock (" + list.get(i).getName() + ")";
//					  response.setContentType("text/html; charset=UTF-8");
//			            PrintWriter out = response.getWriter();
//			            out.println("<script>alert('" + errormessage + "');</script>");
//			            out.flush(); 
			            System.out.println(errormessage);
					return "redirect: cart.mc?errormessage=" + errormessage;
					
				}
			}

			if (b == true) {
				int num = service.oinsert(vo);
				String order_id = (String) service.getorderid();
				for (int i = 0; i < list.size(); i++) {
					int product_id = list.get(i).getProduct_id();
					int count = list.get(i).getCount();

					OrderDetailVO od = new OrderDetailVO(order_id, product_id, count);
					service.registerdetail(od);
					
					service.minusamount(list.get(i));
					service.plussoldamount(list.get(i));

				}
				cservice.clear(vo.getEmail()); // 주문 완료시 그거 해당 카트 비워주는 역할.
				return "redirect: orderdetail.mc?order_id=" + order_id;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "redirect: main.mc";

	}

	@RequestMapping("orderlist.mc")
	public ModelAndView orderlist(ModelAndView mav, HttpServletRequest request) {
		ArrayList<OrderVO> list;
		String email = request.getParameter("email");
		try {
			list = service.getAll(email);
			mav.addObject("olist", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		mav.addObject("center", "orderlist");
		mav.setViewName("main");
		return mav;
	}

	@RequestMapping("orderdetail.mc")
	public ModelAndView orderdetail(ModelAndView mav, HttpServletRequest request) {
		ArrayList<OrderListVO> list;
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");
		String order_id = request.getParameter("order_id");
		try {
			UserVO uvo = (UserVO) uservice.get(email);
			list = service.selectdetail(order_id);
			for (int i = 0; i < list.size(); i++) {
				list.get(i).setUser_address(uvo.getAddress());
				list.get(i).setUser_name(uvo.getName());

				ProductVO pvo = sservice.pick(list.get(i).getProduct_id());
				list.get(i).setProduct_name(pvo.getName());

			}
			mav.addObject("odlist", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		mav.addObject("center", "orderdetail");
		mav.setViewName("main");
		return mav;
	}

}
