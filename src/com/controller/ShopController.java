package com.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frame.Service;
import com.vo.ProductVO;

@Controller
public class ShopController {

	@Resource(name = "shopservice")
	Service<String, ProductVO> service;
	
	

	@RequestMapping("/shop-single.mc")
	public ModelAndView shop_single(ModelAndView mav,HttpServletRequest request) {


		int product_id = Integer.parseInt(request.getParameter("id"));
		
		try {

			ProductVO list = service.pick(product_id);
			mav.addObject("dbproduct",list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mav.addObject("center", "viewdetail/shop-single");
		mav.setViewName("main");
		return mav;
	}
	
	
//test case를 위함
//이걸로 product를 넣어줫음..
	@RequestMapping("/test.mc")
	public String test() {
		for(int i = 25; i < 33; i++) {
		ProductVO p;
		int product_id = i;
//		int product_id = 24;
		String name = "testcase" + i;
//		String name = "testcase" + 24;
		int price = (int) (Math.random()*400 + 1 )*10;
		int stock = (int)(Math.random()*100 + 1 );
		String img = "img" + (int)(Math.random()*4 + 9 ) + ".png";
//		String img = "img8.png";
		int category_id = 8;
		int soldamount = (int)(Math.random()*17 + 1 );
		String description = "board 입니다. 임시로 넣은 test case입니다.";
		p = new ProductVO(product_id,name,price,stock,img,category_id,soldamount,description);
		try {
			service.register(p);
			System.out.println("성공");
			System.out.println(p.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

		return "redirect:main.mc";
	}
	//test case를 위함.
	
	
	
//	@RequestMapping("/shop-single.mc")
//	public ModelAndView shop_single(
//			HttpServletRequest request
//			) {
//		
//		ModelAndView mv = new ModelAndView();
//		
//		ProductVO dbproduct = null;
//		int product_id = Integer.parseInt(request.getParameter("id"));
//		try {
//			dbproduct = service.get("product_id");
//			if(dbproduct.getProduct_id()==product_id) {
//				mv.addObject("pro_detail", dbproduct);
//				
//			}else {
//				mv.setViewName("shop");
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		mv.setViewName("shop-single");
//		return mv;
//	}
	
	
	
//	
}
