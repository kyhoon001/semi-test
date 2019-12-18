package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.frame.CartService;
import com.frame.Service;
import com.shop.ShopService;
import com.vo.CartProductVO;
import com.vo.CartVO;
import com.vo.UserVO;

@Controller
public class PurchaseController {
	
	@Resource(name="uservice")
	private Service service;
	
	@Resource(name = "cartservice")
	CartService<String,CartVO,CartProductVO> cservice;
	ShopService pservice;
	

	ArrayList<CartProductVO> list;

	@RequestMapping("/checkout.mc")
	public ModelAndView userDetail(ModelAndView mav, UserVO user, HttpServletRequest request) {
		
		String email = request.getParameter("email");
		
	
		try {
			user = (UserVO) service.get(email);
			mav.addObject("checkuser",user);
			
			list = cservice.getAll(email);
			
			int total = 0;
			for(int i = 0; i < list.size(); i++) {
				total += (list.get(i).getPrice() * list.get(i).getCount());
			}
			
			mav.addObject("plist",list);
			mav.addObject("total",total);
//			mav.addObject("cartlist", "cartlist");
//			mav.addObject("listamount", list.size()); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
		mav.addObject("center", "checkout");
		mav.setViewName("main");
;		
		return mav;
	}
	


	
	
	
	
	
	
	
}
